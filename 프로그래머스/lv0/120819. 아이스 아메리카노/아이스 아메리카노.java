class Solution {
    public int[] solution(int money) {
        int[] answer = {};
        int coffee = money / 5500;
        int rest = money % 5500;
        answer = new int[2];
        answer[0] = coffee;
        answer[1] = rest;
        return answer;
    }
}