package programmers.level0;

/**
 * 머쓱이보다 키 큰 사람 - 배열 + 크기비교
 */
public class Code120585 {
}


class Code120585_1 {
    public int solution(int[] array, int height) {
        int answer = 0;
        for (int i : array) {
            if (height < i)
                answer += 1;
        }
        return answer;
    }
}