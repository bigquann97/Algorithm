import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int maxIdx = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < 9; i++) {
            int num = Integer.parseInt(br.readLine());

            if (num >= max) {
                max = num;
                maxIdx = i;
            }
        }

        System.out.println(max);
        System.out.println(maxIdx + 1);

    }
}