import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    int k = Integer.parseInt(br.readLine());

    for (int i = 0; i < k; i++) {
      sb.append(i + 1).append("\n");
    }

    System.out.println(sb);

    br.close();
  }
}