class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        answer = 0;
        for (int i = 0; i < count; i++) {
            answer += price * (i+1);
        }

        answer = answer - money;
        if(answer <0) {
            return 0;
        }

        return answer;
    }
}