class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        for(int i = 0; i < s1.length; i++) {
            String a = s1[i];
            for(int j = 0; j < s2.length; j++) {
                String b = s2[j];
                if(a.equals(b)) {
                    answer++;
                }
            }
        }
        return answer;
    }
}