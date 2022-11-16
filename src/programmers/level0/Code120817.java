package programmers.level0;

/**
 * 배열의 평균값 - 0.5와 0.0 로 소수점 첫 째 짜리까지만 출력
 */
public class Code120817 {
}

class Code120817_1 {
    public double solution(int[] numbers) {
        double answer = 0;
        for (int number : numbers) {
            answer += number;
        }

        double v = answer / numbers.length;
        if((v * 10) % 10 == 5) {
            v = (int) v + 0.5;
        } else if ((v * 10) % 10 == 0) {
            v = (int) v + 0.0;
        }
        return v;
    }
}