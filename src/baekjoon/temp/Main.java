package baekjoon.temp;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());

        for (int i = 0; i < 9; i++) {
            bw.write(a + " * " + (i + 1) + " = " + a * (i + 1) + "\n");
        }
        bw.flush();
        bw.close();
    }
}
