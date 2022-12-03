import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        ArrayList<Integer> arrlist = new ArrayList<>();
        for(int i : array) {
            if(arrlist.get(i) == 0) {
                arrlist.set(i, 1);
            }
            arrlist.add(i, ++arrlist.get(i));
        }
        System.out.println(arrlist);
        return answer;
    }
}