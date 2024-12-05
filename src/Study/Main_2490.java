package Study;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class _2490 {
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);

        for (int i = 0; i < 3; i++) {
            int cnt = 0;
            // 배열 생성
            int[] yutnori = new int[4];  // 배열의 길이 설정
            String[] input = br.readLine().split(" ");  // 문자열 배열로 받고

            // 입력값을 배열에 저장
            for (int k = 0; k < yutnori.length; k++) {
                yutnori[k] = Integer.parseInt(input[k]);  // 문자열을 정수로 변환해서 배열에 저장
            }

            for (int j = 0; j<yutnori.length; j++) {
                if (yutnori[j] == 0) {
                    cnt++;
                }
            }

            if (cnt==0) {
                System.out.println('E');
            } else if (cnt==1) {
                System.out.println('A');
            } else if (cnt==2) {
                System.out.println('B');
            } else if (cnt==3) {
                System.out.println('C');
            } else {
                System.out.println('D');
            }
        }

    }
}
