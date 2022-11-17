package programmers.level1;

import java.util.*;

public class Code42889 {
    public static void main(String[] args) {
        int N = 5;
        int[] stages = new int[]{2, 1, 2, 3, 2, 4, 3, 3};

        Code42889_1 a = new Code42889_1();
        int[] solution = a.solution(N, stages);
        String s = Arrays.toString(solution);
        System.out.println("s = " + s);
    }
}


class Code42889_1 {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        HashMap<Integer, int[]> map = new HashMap<>();
        ArrayList<Double> arr = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        int maxIndex;
        double maxValue;

        for (int i = 1; i <= N + 1; i++) {
            map.put(i, new int[]{0, 0});
        }

        for (int i = 1; i <= map.size(); i++) {
            System.out.println(i+"단계 스테이지: " + map.get(i)[0] + "명 실패, " + map.get(i)[1] +"명 도전");
        }

        System.out.println("=======================");

        for (int stage : stages) {
            for (int j = 1; j <= stage; j++) {
                map.get(j)[1] += 1;
                if (j == stage) {
                    map.get(j)[0] += 1;
                }
            }
        }

        for (int i = 1; i <= map.size(); i++) {
            System.out.println(i+"단계 스테이지: " + map.get(i)[0] + "명 실패, " + map.get(i)[1] +"명 도전");
        }
        System.out.println("=======================");

        for (int i = 0; i < map.size() - 1; i++) {
            if(map.get(i+1)[1] == 0) {
                arr.add(0.0);
                continue;
            }
            double v = (double) map.get(i + 1)[0] / map.get(i + 1)[1];
            arr.add(v);
        }

        System.out.println("arr = " + arr);
        System.out.println("=======================");

        while(temp.size() != arr.size()) {
            maxIndex = 0;
            maxValue = arr.get(0);
            for (int i = 0; i < arr.size(); i++) {
                if(arr.get(i) > maxValue) {
                    maxValue = arr.get(i);
                    maxIndex = i;
                }
            }
            arr.set(maxIndex, (double) -1);
            System.out.println("arr = " + arr);
            temp.add(maxIndex + 1);
        }

        System.out.println("=======================");

        for (int i = 0; i < answer.length; i++) {
            answer[i] = temp.get(i);
        }

        return answer;
    }
}

/*
        for (int i = 1; i <= map.size(); i++) {
            System.out.println(i+"단계 스테이지: " + map.get(i)[0] + "명 실패, " + map.get(i)[1] +"명 도전");
        }
 */