package Study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_26560 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String sentence = br.readLine();
            if (!sentence.endsWith(".")) {
                sentence += ".";
            }
            result.append(sentence).append("\n");
        }
        System.out.print(result.toString());
    }
}
