package Study;
import java.util.Scanner;

public class Main_32775 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int f = sc.nextInt();

        if(h > f) {
            System.out.println("flight");
        }else {
            System.out.println("high speed rail");
        }
        sc.close();
    }
}