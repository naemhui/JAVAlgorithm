package Study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main_1977 {
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);

        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        ArrayList<Integer> lst = new ArrayList<>();
        for (int i = M; i <= N; i++) {
            double root = Math.sqrt(i);
            if (i == (int) root * (int) root) {
                lst.add(i);
            }
        }

        if (lst.size() == 0) {
            System.out.println(-1);
        } else {
            int sum = 0;
            for (int num : lst) {
                sum += num;
            }
            System.out.println(sum);
            System.out.println(lst.get(0));
        }
    }
}
