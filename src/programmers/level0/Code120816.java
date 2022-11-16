package programmers.level0;

/**
 * 피자 나눠먹기 3
 * https://school.programmers.co.kr/learn/courses/30/lessons/120816
 */
public class Code120816 {
}


class Code120816_1 {
    public int solution(int slice, int n) {
        int answer = 0;
        answer += n / slice;
        if(n % slice > 0) {
            answer += 1;
        }
        return answer;
    }
}