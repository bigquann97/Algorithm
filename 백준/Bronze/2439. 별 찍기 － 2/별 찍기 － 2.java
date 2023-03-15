import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String a = br.readLine();
    StringBuilder sb = new StringBuilder();

    int k = Integer.parseInt(a);
    int temp = k;

    for (int i = 0; i < k; i++) {
      sb.append(" ".repeat(--temp));
      sb.append("*".repeat(i + 1));
      sb.append("\n");
    }

    System.out.println(sb);
    br.close();
  }
}