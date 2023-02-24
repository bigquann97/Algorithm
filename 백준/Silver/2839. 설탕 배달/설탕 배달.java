import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int N;
        N = Integer.parseInt(br.readLine());

        //////////////////////////////////////////

        int answer = Integer.MAX_VALUE;

        for (int i = N / 5; i >= 0; i--) {
            int count = 0;
            count += i;

            int tmp = N - 5 * i;

            if (tmp % 3 == 0) {
                count += tmp / 3;
                if (answer > count)
                    answer = count;
            }
        }
        if (answer == Integer.MAX_VALUE)
            System.out.println("-1");
        else {
            sb.append(answer);
            System.out.println(sb);
        }
    }
}