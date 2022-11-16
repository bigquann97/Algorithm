package programmers.level1;

/**
 * 없는 숫자 더하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/86051
 */
public class Code86051 {
}

class Code86051_1 {
    public int solution(int[] numbers) {
        int answer = 0;
        for (int number : numbers) {
            answer+= number;
        }

        return 45 - answer;
    }
}