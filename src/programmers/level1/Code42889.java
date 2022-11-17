package programmers.level1;

import java.math.BigDecimal;
import java.util.*;

public class Code42889 {
    public static void main(String[] args) {
        int N = 5;
        int[] stages = new int[]{2, 1, 2, 6, 2, 4, 3, 3};

        Code42889_1 a = new Code42889_1();
        int[] solution = a.solution(N, stages);
        String s = Arrays.toString(solution);
        System.out.println("s = " + s);
    }
}


class Code42889_1 {
    public int[] solution(int N, int[] stages) {
        int[] answer = {};

        Map<Integer, int[]> map = new HashMap<>();
        Map<Integer, Double> failure = new HashMap<>();

        for (int i = 1; i <= N + 1; i++) {
            map.put(i, new int[]{0, 0});
        }

        for (int i = 0; i < stages.length; i++) {
            for (int j = 1; j <= stages[i]; j++) { // 스테이지 단계
                map.get(j)[1] += 1;
                if(j == stages[i]) {
                    map.get(j)[0] += 1;
                }
            }
        }

        for (int i = 1; i <= map.size(); i++) {
            Double fail = (double) map.get(i)[0] / map.get(i)[1];
            failure.put(i, fail);
        }

        Double[] doubles = new Double[failure.size() - 1];
        for (int i = 1; i <= failure.size() - 1; i++) {
            doubles[i-1] = failure.get(i);
        }


        answer = new int[doubles.length];


        HashMap<Integer, Double> hashMap = new HashMap<>();
        for (int i = 0; i < doubles.length; i++) {
            hashMap.put(i + 1, doubles[i]);
        }



        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Double> b = new ArrayList<>();

        for (int i = 1; i <= hashMap.size(); i++) {
            b.add(hashMap.get(i));
        }

        while(a.size() != b.size()) {

            int maxIndex = 0;
            double max = b.get(0);

            for (int i = 0; i < b.size(); i++) {
                if(b.get(i) > max) {
                    maxIndex = i;
                    max = b.get(i);
                }
            }

            a.add(maxIndex + 1);
            b.set(maxIndex, (double) -1);
        }

        answer = new int[a.size()];
        for (int i = 0; i < a.size(); i++) {
            answer[i] = a.get(i);
        }


        return answer;
    }
}