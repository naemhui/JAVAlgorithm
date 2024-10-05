package Study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main_1551 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 첫 번째 입력 : N, K
        String[] firstInput = br.readLine().split(" ");
        int N = Integer.parseInt(firstInput[0]);
        int K = Integer.parseInt(firstInput[1]);

        // 두 번째 입력 : seq(리스트)
        String[] seqInput = br.readLine().split(",");
        List<Integer> seq = new ArrayList<>();
        for (String s : seqInput) {
            seq.add(Integer.parseInt(s));  // 정수로 변환해서 리스트에 add
        }

        for (int k = 0; k < K; k++) {
            for (int i = 0; i < seq.size()-1; i++) {
                seq.set(i, seq.get(i+1) - seq.get(i));
            }
            seq.remove(seq.size() -1);
        }

        // 출력
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < seq.size(); i++) {
            result.append(seq.get(i));
            if (i != seq.size() -1) {  // i가 마지막 인덱스가 아니라면
                result.append(',');   // ',' 추가
            }
        }
//        System.out.println(result.toString());  // String으로 변환
        System.out.println(result);  // 자동으로 toString() 호출
    }
}
