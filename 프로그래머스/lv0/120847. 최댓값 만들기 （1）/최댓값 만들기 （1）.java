class Solution {
    public int solution(int[] numbers) {
        int max = numbers[0];
        int maxIndex = 0;

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] > max) {
                max = numbers[i];
                maxIndex = i;
            }
        }
        numbers[maxIndex] = 0;
        int max2 = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] > max2) {
                max2 = numbers[i];
                maxIndex = i;
            }
        }

        return max * max2;
    }
}
