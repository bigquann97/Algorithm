class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        int i = 1;
        while(i * code <= cipher.length()) {
            answer += String.valueOf(cipher.charAt(i * code - 1));
            i++;
        }
        return answer;
    }
}