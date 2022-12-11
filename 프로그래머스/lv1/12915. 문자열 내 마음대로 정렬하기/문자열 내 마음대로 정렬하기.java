import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];

        Map<String, Character> map = new HashMap<>();

        for (int i = 0; i < strings.length; i++) {
            map.put(strings[i], strings[i].charAt(n));
        }

        List<String> keySet = map.keySet().stream().sorted().collect(Collectors.toList());

        List<String> collect = keySet.stream().sorted(Comparator.comparing(map::get)).collect(Collectors.toList());

        
        
        for (int i = 0; i < strings.length; i++) {
            answer[i] = collect.get(i);
        }

        return answer;
    }
}