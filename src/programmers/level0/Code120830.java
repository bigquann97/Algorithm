package programmers.level0;

/**
 * 양꼬치
 */

public class Code120830 {
}

class Code120830_1 {
    public int solution(int n, int k) {
        int answer = 0;
        int free = n / 10;
        return 12000 * n + k * 2000 - 2000 * free;
    }
}