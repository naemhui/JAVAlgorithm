package Study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_14659 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        String input = br.readLine();
        sb.append(input);

        String[] strArr = sb.toString().split(" ");
        int maxKill = 0;
        int kill = 0;
        for(int i=0; i<strArr.length; i++) {
            kill = 0;  // 다음 유저로
            for(int j=i+1; j<strArr.length; j++) {
                // 오른쪽 봉우리가 더 높다면
                if(Integer.parseInt(strArr[i]) < Integer.parseInt(strArr[j])) {
                    // 가장 많이 킬한 숫자보다 현재가 더 높다면
                    if(kill > maxKill) {
                        maxKill = kill;  // 현재 kill을 저장
                    }
                    // for문 종료
                    break;
                }  else if(Integer.parseInt(strArr[i]) > Integer.parseInt(strArr[j])) { // 오른쪽 봉우리가 더 낮아 킬하게 된다면
                    kill++;
                    if(j == (strArr.length-1) && kill > maxKill) { // 마지막 인덱스에 현재 킬이 최고 킬보다 많다면
                        maxKill = kill;
                    }
                }
            }
        }
        System.out.println(maxKill);
    }
}