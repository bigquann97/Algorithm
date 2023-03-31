import java.util.*;

class Solution {
    public int solution(int[] array) {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        Arrays.sort(array);
        Integer value = array[0];
        int count = 0;
        
        for(int i = 0; i < array.length; i++) {
            if(array[i] == value) {
                count++;
            } else {
                map.put(array[i-1], count);
                count = 1;
                value = array[i];
            }
            
            if(i == array.length - 1) {
                map.put(value, count);
            }
        }
        
        int maxValue = -1;
        Set<Integer> keySet = map.keySet();
        int answer = 0;
        int loop = 0;
        
        for(Integer key : keySet) {
            int k = key;
            int v = map.get(key);
            
            if(v >= maxValue) {
                maxValue = v;
                answer = k;
            }
        }
        
        int reCount = 0;
        
        for(Integer key : keySet) {
            int v = map.get(key);            
            if(v == maxValue) {
                reCount++;
            }
            if(reCount >= 2) {
                return -1;
            }
        }
        
        return answer;
    }
}