import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Double> arr = new ArrayList<>();

        for (int i = 0; i < len; i++) {
            arr.add(Double.parseDouble(st.nextToken()));
        }

        Collections.sort(arr);

        Double answer = 0.0;

        for (int i = 0; i < len; i++) {
            answer += arr.get(i) / arr.get(len - 1) * 100;
        }

        System.out.println(answer / len);
    }
}