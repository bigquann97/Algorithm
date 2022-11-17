package programmers.level1;

import java.util.ArrayList;

public class Code12977 {
    public static void main(String[] args) {
        int[] c = new int[]{1,2,7,6,4};
        Code12977_1 a = new Code12977_1();
        int solution = a.solution(c);
        System.out.println("solution = " + solution);
    }
}

class Code12977_1 {
    public int solution(int[] nums) {
        int answer = 0;
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int temp = nums[i] + nums[j] + nums[k];
                    arr.add(temp);
                }
            }
        }

        for (Integer integer : arr) {
            if(isSosu(integer)) {
                answer++;
            }
        }

        return answer;
    }

    public static boolean isSosu(int num){
        if(num < 2) return false;
        if(num == 2) return true;
        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}