import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        char[] chars = br.readLine().toCharArray();

        int answer = 0;

        for (int i = 0; i < chars.length; i++) {
            answer += chars[i] - '0';
        }

        System.out.println(answer);
    }
}