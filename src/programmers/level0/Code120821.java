package programmers.level0;

/**
 * 배열 뒤집기
 * https://school.programmers.co.kr/learn/courses/30/lessons/120821
 */
public class Code120821 {
}

class Code120821_1 {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        answer = new int[num_list.length];

        for (int i = num_list.length - 1; i >= 0; i--) {
            answer[num_list.length - i - 1] = num_list[i];
        }

        return answer;
    }
}