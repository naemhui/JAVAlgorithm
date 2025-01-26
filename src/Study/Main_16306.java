package Study;

import java.util.Scanner;

public class Main_16306 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        sc.close();

        int minSurfaceArea = Integer.MAX_VALUE;

        for (int a = 1; a * a * a <= V; a++) {
            for (int b = a; b * b <= V / a; b++) {
                if (V % (a * b) == 0) {
                    int c = V / (a * b);
                    if (b <= c) {
                        int surfaceArea = 2 * (a * b + b * c + c * a);
                        minSurfaceArea = Math.min(minSurfaceArea, surfaceArea);
                    }
                }
            }
        }

        System.out.println(minSurfaceArea);
    }
}
