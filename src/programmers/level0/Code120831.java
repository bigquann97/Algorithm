package programmers.level0;

/**
 * 짝수의 합
 */
public class Code120831 {
}

class Code120831_1 {
    public int solution(int n) {
        int answer = 0;
        for (int i = n; i > 0; i--) {
            if(i % 2 == 0)
                answer += i;
        }
        return answer;
    }
}

