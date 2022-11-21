import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int count = Integer.parseInt(st.nextToken());

        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < count; i++) {
            st = new StringTokenizer(br.readLine());
            int target = Integer.parseInt(st.nextToken());
            stack.push(target);
            if (target == 0 && stack.isEmpty()) {
                stack.pop();
            } else if(target == 0) {
                stack.pop();
                stack.pop();
            }
        }

        Long result = 0L;

        for (Integer integer : stack) {
            result += integer;
        }
        
        String s = Long.toString(result);

        bw.write(s);
        bw.flush();
        bw.close();
    }
}
