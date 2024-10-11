package Study;

import java.io.*;
import java.util.*;

public class Main_6609 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String tmp;
        while((tmp=br.readLine())!=null){
            StringTokenizer st = new StringTokenizer(tmp);
            int M = Integer.parseInt(st.nextToken()); //모기성충
            int P = Integer.parseInt(st.nextToken()); //번데기
            int L = Integer.parseInt(st.nextToken()); // 유충
            int E = Integer.parseInt(st.nextToken()); // 모기가 낳는 알 수
            int R = Integer.parseInt(st.nextToken()); // 살아남는 유충
            int S = Integer.parseInt(st.nextToken()); // 살아남는 번데기
            int N = Integer.parseInt(st.nextToken()); // N주후 모기

            for(int i =0; i<N;i++){
                int m = M;
                M = P/S;
                P = L/R;
                L = m*E;
            }

            System.out.println(M);
        }

    }
}