package Study;

import java.io.*;
import java.util.*;

public class Main_16173 {
    static int N;
    static int[][] arr;
    static boolean[][] visited;
    static int[] dx = {0, 1}, dy = {1, 0}; // 오른쪽, 아래

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        arr = new int[N][N];
        visited = new boolean[N][N];  // 모든 칸 false로 초기화

        // arr에 보드 정보 저장
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // DFS 탐색 시작. (0,0)에서 출발하여 재귀
        dfs(0, 0);
        // DFS 끝나고도 도착 지점에 도달하지 못했다면 "Hing"
        System.out.println("Hing");
    }

    // (i, j)가 도착지점인지 확인. -1이면 "HaruHaru" 출력
    public static void dfs(int i, int j) {
        if (arr[i][j] == -1) {
            System.out.println("HaruHaru");
            System.exit(0);
        }

        for (int k = 0; k < 2; k++) {
            int x = i + dx[k] * arr[i][j];
            int y = j + dy[k] * arr[i][j];
            // 다음 위치가 N 초과하거나 이미 방문한 위치라면 continue로 건너뜀
            if (x >=N || y>=N || visited[x][y]) continue;

            // 새로운 위치를 true로 방문처리, dfs(x,y) 재귀 호출
            visited[x][y] = true;
            dfs(x, y);
        }
    }
}
