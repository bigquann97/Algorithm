import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // A, B, C 입력 받기
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        // A × B × C 계산
        int result = A * B * C;

        // 0부터 9까지 각 숫자의 등장 횟수 계산
        int[] count = new int[10];
        while (result > 0) {
            int digit = result % 10;
            count[digit]++;
            result /= 10;
        }

        // 결과 출력
        for (int i = 0; i < 10; i++) {
            System.out.println(count[i]);
        }
    }
}
