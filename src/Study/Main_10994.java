
package Study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_10994 {

    static char a[][];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int len = 1;
        for (int i = 1; i < n; i++) len += 4;
        a = new char[len][len];

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                a[i][j] = ' ';
            }
        }

        drawStar(0, len);

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }

    public static void drawStar(int s, int len) {
        for (int i = s; i < len; i++) {
            a[s][i] = '*'; // 맨 위 가로줄
            a[len - 1][i] = '*'; // 맨 아래 가로줄
            a[i][s] = '*'; // 왼쪽 세로줄
            a[i][len - 1] = '*'; // 오른쪽 세로줄
        }

        if (len == 1) return;
        drawStar(s + 2, len - 2);
    }
}
