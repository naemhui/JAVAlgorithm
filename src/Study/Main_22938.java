package Study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;  // 문자열을 토큰(단어)로 분리

public class Main_22938 {
    private void solution() throws Exception {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 첫 번째 과녁
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        // 두 번째 과녁
        st = new StringTokenizer(br.readLine());
        int x1 = Integer.parseInt(st.nextToken());
        int y1 = Integer.parseInt(st.nextToken());
        int r1 = Integer.parseInt(st.nextToken());

        // 두 원의 겹침 확인
        // 1l -> long 타입으로 계산
        if (1l*(x-x1)*(x-x1)+1l*(y-y1)*(y-y1) < 1l*(r+r1)*(r+r1)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static void main(String[] args) throws Exception {
        new Main_22938().solution();
    }
}
