class Solution {
    public int solution(String s) {
        int answer = 0;
        int idx = 0;
        boolean flag = true;

        while(flag) {
            if(idx >= s.length())
                break;
            int startCount = 0;
            int anotherCount = 0;
            char sl = s.charAt(idx);
            for (int i = idx; i < s.length(); i++) {
                if(sl == s.charAt(i))
                    startCount++;
                else
                    anotherCount++;
                if (startCount == anotherCount) {
                    answer++;
                    idx = ++i;
                    break;
                }
                if(i == s.length() - 1) {
                    answer++;
                    flag = false;
                    break;
                }
            }
        }

        return answer;
    }
}