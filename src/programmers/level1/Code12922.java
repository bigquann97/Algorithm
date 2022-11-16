package programmers.level1;

/**
 * 수박수박수박
 * https://school.programmers.co.kr/learn/courses/30/lessons/12922
 */
public class Code12922 {
}

class Code12922_1 {
    public String solution(int n) {
        String answer = "";

        for (int i = 0; i < n; i++) {
            answer += i % 2 == 0 ? "수" : "박";
        }

        return answer;
    }
}