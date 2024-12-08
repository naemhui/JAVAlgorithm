package Study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_9366 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        //값 개를 저장할 것이기에 크기가 3인 배열 선언
        int[] arr = new int[3];

        for(int i = 1; i <= T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[0] = Integer.parseInt(st.nextToken());
            arr[1] = Integer.parseInt(st.nextToken());
            arr[2] = Integer.parseInt(st.nextToken());

            //정렬
            Arrays.sort(arr);

            System.out.print("Case #" + i + ": ");

            if(arr[0] + arr[1] <= arr[2]) {
                System.out.println("invalid!");
            }else if(arr[0] == arr[1] && arr[1] == arr[2]) {
                System.out.println("equilateral");
            }else if(arr[0] == arr[1] || arr[1] == arr[2]) {
                System.out.println("isosceles");
            }else {
                System.out.println("scalene");
            }
        }
    }

}