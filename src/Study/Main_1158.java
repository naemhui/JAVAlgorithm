package Study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K= Integer.parseInt(st.nextToken());
        Queue<Integer> queue = new LinkedList<>();
        // 1 ~ N 까지 숫자를 큐에 저장
        for(int i=1; i<=N; i++) {
            queue.offer(i);
        }

        StringBuilder sb = new StringBuilder("<");
        // 큐의 크기가 1보다 클때
        while(queue.size() > 1 ) {
            // 1부터 K번째 수 전까지 큐의 맨 앞 숫자를 삭제 -> 맨 뒤에 추가
            for(int i=1; i<K; i++) {          // 0 ~ K
                queue.offer(queue.poll());
            }
            // K번째 수를 저장
            sb.append(queue.poll()).append(", ");
        }
        // while 문이 다 돌면 큐에는 원소 하나만 남아있을것이다.
        // 그렇다면 남은 원소를 다시 저장
        if(queue.size() == 1) {
            sb.append(queue.poll()).append(">");
        }
        System.out.println(sb);
    }
}