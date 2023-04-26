import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 테스트 케이스 개수 입력 받기
        int T = scanner.nextInt();

        // 각 테스트 케이스에 대해 점수 계산
        for (int i = 0; i < T; i++) {
            String result = scanner.next();
            int score = 0; // 각 테스트 케이스의 점수

            int consecutive = 0; // 연속된 O의 개수
            for (int j = 0; j < result.length(); j++) {
                if (result.charAt(j) == 'O') {
                    consecutive++;
                    score += consecutive;
                } else {
                    consecutive = 0;
                }
            }

            // 결과 출력
            System.out.println(score);
        }
    }
}
