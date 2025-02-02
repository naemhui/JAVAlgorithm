package Study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main_20124 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Node[] nodes = new Node[N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int score = Integer.parseInt(st.nextToken());
            nodes[i] = new Node(name, score);
        }

        // 정렬: 점수 내림차순, 점수가 같으면 이름 오름차순
        Arrays.sort(nodes, Comparator.comparingInt(Node::score).reversed()
                .thenComparing(Node::name));

        System.out.println(nodes[0].name);
    }

    record Node(String name, int score) {}
}
