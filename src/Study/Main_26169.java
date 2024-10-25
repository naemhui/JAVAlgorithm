/*
3번 이하의 이동으로 사과를 2개 이상 먹을 수 있는가
*/
package Study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_26169 {
    static int dx[] = {0, 0, -1, 1};
    static int dy[] = {-1, 1, 0, 0};
    static int map[][] = new int[5][5];
    static int start_x, start_y; // 학생 초기 위치
    static int result = 0; // 사과 2개 이상 먹을 수 있으면 1, 없으면 0

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            String s[] = bufferedReader.readLine().split(" ");
            for (int j = 0; j < 5; j++) {
                map[i][j] = Integer.parseInt(s[j]);
            }
        }
        String[] split = bufferedReader.readLine().split(" ");
        start_x = Integer.parseInt(split[0]);
        start_y = Integer.parseInt(split[1]);

        findApple(start_x, start_y, 0, 0);
        System.out.println(result);
    }

    // (x, y)에서 시작, depth(이동 횟수)와 apple(사과 개수) 추적
    public static void findApple(int x, int y, int depth, int apple) {
        if (map[x][y] == 1) {
            apple++;
        }
        // 3번 이동하면 재귀 종료
        if (depth == 3) {
            // 사과 2개 이상 먹었으면 결과를 1로 설정
            if (apple >= 2) {
                result = 1;
            }
            return;
        }
        // 상하좌우 방향으로 DFS
        for (int i = 0; i < 4; i++) {
            int xx = x + dx[i];
            int yy = y + dy[i];

            if (xx < 0 || xx >= 5 || yy < 0 || yy >= 5 || map[xx][yy] == -1) {
                continue; // 보드 벗어나면 건너뜀
            }

            // 지금 이동한 칸으로 다시 못 돌아오게 임시로 벽 채우기
            map[x][y] = -1;
            findApple(xx, yy, depth + 1, apple);
            // 다음 탐색을 위해 벽을 원래 상태로 되돌리기
            map[x][y] = 0;
        }
    }
}
