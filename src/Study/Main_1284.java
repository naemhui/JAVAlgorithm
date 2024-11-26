package Study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_1284 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 무한 루프
        while(true) {
            String N = br.readLine();
            int length = 1;
            if(N.equals("0")) {
                break;
            }
            for (int i = 0; i < N.length(); i++) {
                if(N.charAt(i) == '1') {
                    length += 3;
                } else if(N.charAt(i) == '0') {
                    length += 5;
                } else {
                    length += 4;
                }
            }
            System.out.println(length);
        }
    }
}
