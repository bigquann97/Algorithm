package programmers.level1;

public class Code132267 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution(3, 1, 20);
    }
}

class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;

        int giveYouCoke = a; // 4
        int getCoke = b; // 2
        int haveCoke = n; // 22
        int newCoke = 0;
        int restCoke = 0;
        int giveTotalCoke = 0;

        while(haveCoke >= a) {
            newCoke = (haveCoke / giveYouCoke) * getCoke;
            giveTotalCoke = haveCoke - restCoke;
            restCoke = haveCoke % giveYouCoke;
            haveCoke = haveCoke - giveTotalCoke + newCoke;
            answer += newCoke;
        }
        return answer;
    }
}