package programmers.level1;

import java.util.ArrayList;
import java.util.List;

public class Code12954 {
}


class Code12954_1 {
    public long[] solution(int x, int n) {
        ArrayList<Long> arr = new ArrayList<>();
        Long a = Long.valueOf(x);
        for (int i = 0; i < n; i++) {
            arr.add(a + (a * i));
        }
        long[] answer = new long[arr.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = arr.get(i);
        }
        return answer;
    }
}