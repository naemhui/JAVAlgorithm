package Study;

import java.util.Scanner;

public class Main_15727 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if (N % 5 > 0) {
            System.out.println((N / 5 + 1));
        }
        else {
            System.out.println(N / 5);
        }
    }
}
