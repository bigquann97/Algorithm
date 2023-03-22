import java.util.*;

class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        char[] set = s.toCharArray();

        for(char c : set) {
            if(c >= 'a' && c <= 'z') {
                char result = (char) (c + n);
                if(result > 'z') {
                    result -= 26;
                }
                answer += result;
            } else if (c >= 'A' && c <='Z') {
                char result = (char) (c + n);
                if(result > 'Z') {
                    result -= 26;
                }
                answer += result;
            } else {
                answer += c;
            }
            
        }
        
        return answer;
    }
}