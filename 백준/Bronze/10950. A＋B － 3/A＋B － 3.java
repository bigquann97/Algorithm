import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String a = br.readLine();

    int k = Integer.parseInt(a);

    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < k; i++) {
      String[] s = br.readLine().split(" ");
      int a1 = Integer.parseInt(s[0]);
      int b2 = Integer.parseInt(s[1]);
      sb.append((a1 + b2) + "\n");
    }

    System.out.println(sb);

    br.close();
  }
}