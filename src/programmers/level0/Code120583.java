package programmers.level0;

/**
 * 중복된 숫자 개수
 */
public class Code120583 {
}


class Code120583_1 {
    public int solution(int[] array, int n) {
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == n) {
                answer += 1;
            }
        }
        return answer;
    }
}
