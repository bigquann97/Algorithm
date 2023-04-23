class Solution {
    public boolean solution(int x) {
        int sum = 0;
        int temp = x;
        
        while(temp > 0) {
            sum += temp % 10; // 첫 자리 수 sum에 더하고
            temp = temp / 10; // x 에 첫 자리수 없앤 값 대입
        }
        
        if(x % sum == 0) return true;

        return false;
    }
}