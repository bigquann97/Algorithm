import java.util.*;

class Solution {
    public int solution(int[] array) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : array) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        List<Integer> list = new ArrayList<>(map.keySet());
        list.sort((o1, o2) -> map.get(o2).compareTo(map.get(o1)));
        if(map.size() == 1) {
            return list.get(0);
        } else if (map.get(list.get(0)) == map.get(list.get(1))) {
            return -1;
        } else {
            return list.get(0);
        }
    }
}