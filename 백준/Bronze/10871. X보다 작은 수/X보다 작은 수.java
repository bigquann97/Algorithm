import java.io.*;
import java.util.ArrayList;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);

        String[] nums = br.readLine().split(" ");

        ArrayList<Integer> answer = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < nums.length; i++) {
            if (Integer.parseInt(nums[i]) < b) {
                sb.append(nums[i]).append(" ");
            }
        }

        System.out.println(sb);


    }
}