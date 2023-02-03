import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] k = s.split(" ");
        int[] temp = new int[k.length];
        for(int i = 0; i < k.length; i++) {
            temp[i] = Integer.parseInt(k[i]);
        }
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for(int i = 0; i < temp.length; i++) {
            if(temp[i] > max) {
                max = temp[i];
            }
            if(temp[i] < min) {
                min = temp[i];
            }
        }
        
        String ma = String.valueOf(max);
        String mi = String.valueOf(min);
        
        answer = mi + " " + ma;
        
        return answer;
    }
}