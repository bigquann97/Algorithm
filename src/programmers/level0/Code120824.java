package programmers.level0;

/**
 * 짝수 홀수 개수
 * https://school.programmers.co.kr/learn/courses/30/lessons/120824
 */
public class Code120824 {
}

class Code120824_1 {
    public int[] solution(int[] num_list) {
        int[] answer = {};

        int odd = 0;
        int even = 0;

        for (int i : num_list) {
            if (i % 2 == 0) {
                even += 1;
            } else {
                odd += 1;
            }
        }
        answer = new int[]{even, odd};

        return answer;
    }
}