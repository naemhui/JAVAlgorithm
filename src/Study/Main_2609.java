package Study;

import java.util.Scanner;

public class Main_2609 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        int d = gcd(a, b);  // 최대공약수

        System.out.println(d);
        System.out.println(a * b / d);
    }

    // 최대공약수 반복문
    public static int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;  // 나머지
            a = b;
            b = r;
        }
        return a;
    }
}
