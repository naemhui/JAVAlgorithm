package Study;

import javax.sound.midi.Soundbank;
import java.io.*;
import java.math.BigInteger;

public class Main_2547 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        long num = Long.parseLong(br.readLine());

        for (int i = 0; i < num; i++) {
//          // 빈칸 받아줌
            String blank = br.readLine();
            int student = Integer.parseInt(br.readLine());
            BigInteger totalCandy = BigInteger.valueOf(0);

            for (int j = 0; j < student; j++) {
                totalCandy = totalCandy.add(new BigInteger(br.readLine()));
            }
            String shareCandy = String.valueOf(totalCandy.remainder(BigInteger.valueOf(student)));

            if (shareCandy.equals("0")) {
                sb.append("YES").append("\n");
            } else{
                sb.append("NO").append("\n");
            }
        }
        System.out.println(sb.toString());
    }
}