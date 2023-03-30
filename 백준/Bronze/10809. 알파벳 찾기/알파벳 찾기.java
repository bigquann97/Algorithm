import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int[] arr = new int[26];

        for (int i = 0; i < arr.length; i++) {
            char c = (char) (i + 'a');
            int index = s.indexOf(c);
            arr[i] = index;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i] + " ");
        }

        System.out.println(sb);
    }
}