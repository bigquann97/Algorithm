class Solution {
    public int solution(int hp) {
        int answer = 0;
        
        // 장 5 병 3 일1
        answer += hp / 5;
        hp %= 5;
        
        answer += hp / 3;
        hp %= 3;
        
        answer += hp / 1;
        hp %= 1;
        
        return answer;
    }
}