package programmers.level1;

/**
 * 약수의 합
 *
 */
public class Code12928 {
}

class Code12928_1 {
    public int solution(int n) {
        int answer = 0;

        for (int i = n; i > 0; i--) {
            if(n % i == 0) {
                answer += i;
            }
        }
        return answer;
    }
}
