package Study;
import javax.sound.midi.Soundbank;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class Main_25206 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Double> grades = new HashMap<>();
        grades.put("A+", 4.5);
        grades.put("A0", 4.0);
        grades.put("B+", 3.5);
        grades.put("B0", 3.0);
        grades.put("C+", 2.5);
        grades.put("C0", 2.0);
        grades.put("D+", 1.5);
        grades.put("D0", 1.0);
        grades.put("F", 0.0);  
        
        double gSum = 0.0;  // 점수 합
        double cSum = 0.0;  // 학점 합
        
        // 20개 과목 입력 받기
        for (int i = 0; i < 20; i++) {
            String[] input = br.readLine().split(" ");
            String S = input[0];  // 과목
            double C = Double.parseDouble(input[1]);  // 학점
            String G = input[2];  // 성적

            // P가 아닐 경우
            if (!G.equals("P")) {
                gSum += C*grades.get(G);  // 총 점수
                cSum += C;  // 총 학점
            }
        }

        // 최종 GPA
        if (cSum != 0) {
            System.out.println(gSum / cSum); // GPA
        } else {
            System.out.println("0.0");  // cSum이 0일 경우
        }
    }
}
