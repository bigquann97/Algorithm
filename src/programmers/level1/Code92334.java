package programmers.level1;

import java.util.*;

/**
 * 신고 결과 받기
 */

public class Code92334 {
    public static void main(String[] args) {
        String[] id_list = new String[]{"con", "ryan"};
        String[] report = new String[]{"ryan con", "ryan con", "ryan con", "ryan con"};
        int k = 3;

        // "muzi", "frodo", "apeach", "neo"
        // "muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"
        Code92334_1 a = new Code92334_1();
        int[] solution = a.solution(id_list, report, k);
    }

}

class Code92334_1 {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = {};

        ArrayList<String> users = new ArrayList<>();
        HashMap<String, Set<String>> singo = new HashMap<>();
        HashMap<String, Integer> singoed = new HashMap<>();
        ArrayList<String> stop = new ArrayList<>();

        for (String s : id_list) {
            users.add(s);
            singo.put(s, new HashSet<>());
            singoed.put(s, 0);
        }


        for (String s : report) {
            String reporter = s.split(" ")[0];
            String reported = s.split(" ")[1];
            singo.get(reporter).add(reported);
        }

        for (int i = 0; i < singo.size(); i++) {
            String s = users.get(i);

            String[] pp = singo.get(s).toArray(new String[singo.get(s).size()]);
            for (String s1 : pp) {
                singoed.replace(s1, singoed.get(s1) + 1);
            }
        }

        for (int i = 0; i < singoed.size(); i++) {
            String s = users.get(i);
            if(singoed.get(s) >= k) {
                stop.add(s);
            }
        }

        answer = new int[users.size()];

        for (int i = 0; i < singo.size(); i++) {
            String s = users.get(i);

            String[] pp = singo.get(s).toArray(new String[singo.get(s).size()]);
            int count = 0;

            for (String s1 : pp) {
                for (String s2 : stop) {
                    if (s2.equals(s1)) {
                        count++;
                    }
                }
            }

            answer[i] = count;
        }

        return answer;
    }
}

/*
        for (String s : id_list) {
            users.add(s);
            singo.put(s, new HashSet<String>());
            singoed.put(s, 0);
        }

        for (String s : report) {
            String reporter = s.split(" ")[0];
            String reported = s.split(" ")[1];

            singo.get(reporter).add(reported);
        }

        for (int i = 0; i < singoed.size(); i++) {
            singoed.replace(users.get(i), singo.get(users.get(i)).size());
        }

        for (int i = 0; i < singoed.size(); i++) {
            String[] strings = singoed.keySet().toArray(new String[singoed.size()]);
            if(singoed.get(strings[i]) >= k) {
                stop.add(strings[i]);
            }
        }

        System.out.println(stop);
        answer = new int[users.size()];

        for (int i = 0; i < singo.size(); i++) {
            int count = 0;
            Set<String> singoList = singo.get(users.get(i));
            for (String s : singoList) {
                for (String s1 : stop) {
                    if (s.equals(s1)) {
                        count += 1;
                    }
                }
            }
            answer[i] = count;
        }

        System.out.println(Arrays.toString(answer));




 */