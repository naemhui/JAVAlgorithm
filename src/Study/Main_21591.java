package Study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_21591 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int wc = Integer.parseInt(st.nextToken());
        int hc = Integer.parseInt(st.nextToken());
        int ws = Integer.parseInt(st.nextToken());
        int hs = Integer.parseInt(st.nextToken());

        if (wc - ws > 1 && hc - hs > 1) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
