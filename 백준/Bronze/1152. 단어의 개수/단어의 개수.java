import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] strings = line.trim().split(" ");

        if (strings[0].equals("")) {
            System.out.println(0);
        } else {
            System.out.println(strings.length);
        }
    }
}