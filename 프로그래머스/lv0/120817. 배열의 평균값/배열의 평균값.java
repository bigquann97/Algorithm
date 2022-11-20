class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        for (int number : numbers) {
            answer += number;
        }

        double v = answer / numbers.length;
        if((v * 10) % 10 == 5) {
            v = (int) v + 0.5;
        } else if ((v * 10) % 10 == 0) {
            v = (int) v + 0.0;
        }
        return v;
    }
}