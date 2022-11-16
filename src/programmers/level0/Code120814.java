package programmers.level0;

/**
 * 피자 나눠먹기 1
 */

public class Code120814 {
}

class Code120814_1 {
    public int solution(int n) {
        int answer = 0;
        answer += n / 7;
        if(n % 7 > 0) {
            answer += 1;
        }
        return answer;
    }
}