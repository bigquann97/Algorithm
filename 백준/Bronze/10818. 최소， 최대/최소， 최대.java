import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

        String line = br.readLine();
        StringTokenizer st = new StringTokenizer(line);

        int max;
        int min;

        ArrayList<Integer> arr = new ArrayList();

        for (int i = 0; i < a; i++) {
            arr.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(arr);

        StringBuilder sb = new StringBuilder();

        sb.append(arr.get(0)).append(" ").append(arr.get(a - 1));

        System.out.println(sb);

    }
}