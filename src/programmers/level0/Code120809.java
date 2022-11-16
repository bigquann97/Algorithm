package programmers.level0;

/**
 * 배열 두배 만들기
 * https://school.programmers.co.kr/learn/courses/30/lessons/120809
 */
public class Code120809 {
}

class Code120809_1 {
    public int[] solution(int[] numbers) {
        int[] answer = {};

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] * 2;
        }

        return numbers;
    }
}