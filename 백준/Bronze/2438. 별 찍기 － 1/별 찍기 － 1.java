import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String a = br.readLine();

    int k = Integer.parseInt(a);

    for (int i = 0; i < k; i++) {
      System.out.println("*".repeat(i + 1));
    }

    br.close();
  }
}