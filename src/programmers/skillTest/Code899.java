package programmers.skillTest;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Code899 {
}


class Solution0 {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i : arr) {
            if(i % divisor == 0) {
                arrayList.add(i);
            }
        }

        arrayList.sort(Comparator.naturalOrder());

        if(arrayList.isEmpty()) {
            answer = new int[]{-1};
        } else {
            answer = new int[arrayList.size()];
            for (int i = 0; i < answer.length; i++) {
                answer[i] = arrayList.get(i);
            }
        }

        return answer;
    }
}