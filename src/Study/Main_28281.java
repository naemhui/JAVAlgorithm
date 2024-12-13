package Study;

import java.io.*;
import java.util.*;

public class Main_28281{
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int x=Integer.parseInt(st.nextToken());

        int[] num=new int[n];
        st=new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            num[i]=Integer.parseInt(st.nextToken());
        }
        int min = 2100000000;
        for(int i=1; i<n; i++){
            num[i-1]=num[i]*x+num[i-1]*x;
            min = min > num[i-1] ? num[i-1] : min;
        }

        bw.write(min+"");
        bw.flush();
    }
}