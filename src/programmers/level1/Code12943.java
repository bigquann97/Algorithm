package programmers.level1;

public class Code12943 {
}

class Code12943_1 {
    public int solution(int num) {
        int answer = 0;

        long l = num;

        while(l != 1) {
            if(l % 2 == 0) {
                l /= 2;
            } else {
                l = l * 3 + 1;
            }
            answer += 1;
            if(answer >= 500) {
                answer = -1;
                break;
            }
        }

        return answer;
    }
}