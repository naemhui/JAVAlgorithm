package Study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_20215 {
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int Width = Integer.parseInt(st.nextToken());
        int Height = Integer.parseInt(st.nextToken());

        double len = Height + Width - Math.sqrt(Height * Height + Width * Width);
        System.out.println(len);
    }
}
