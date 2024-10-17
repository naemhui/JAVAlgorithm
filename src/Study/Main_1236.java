package Study;

import java.io.*;
import java.util.*;

public class Main_1236  {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int y = 0;
        int x = 0;

        String[][] arr = new String[N][M];
        for (int i = 0; i < N; i++) {
            String lst = br.readLine();
            for (int j = 0; j < M; j++) {
                arr[i][j] = String.valueOf(lst.charAt(j));
            }
        }
//        준비 끝

//        가로 검사
        for (int i = 0; i < N; i++) {
            int check = 0;
            for (int j = 0; j < M; j++) {
                if (arr[i][j].equals("X")) {
                    check += 1;
                }
            }
            if (check == 0) {
                x += 1;
            }
        }
//        세로 검사
        for (int i = 0; i < M; i++) {
            int check = 0;
            for (int j = 0; j < N; j++) {
                if (arr[j][i].equals("X")) {
                    check += 1;
                }
            }
            if (check == 0) {
                y += 1;
            }
        }
        System.out.println(Integer.max(x,y));
    }
}
