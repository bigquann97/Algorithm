import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < num; i++) {

            String s = br.readLine();
            char[] chars = s.toCharArray();
            int answer = 0;
            int score = 1;

            for (int j = 0; j < chars.length; j++) {
                if (chars[j] == 'O') {
                    answer += score++;
                } else {
                    score = 1;
                }
            }

            sb.append(answer).append("\n");
        }

        System.out.println(sb);
    }
}