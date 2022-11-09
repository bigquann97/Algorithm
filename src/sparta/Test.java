package sparta;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {
        String test = "hello my name is coby brient hehehehe";
        System.out.println(logic(test));


    }

    public static String logic(String string) {
        String s = string.toLowerCase();
        String s1 = s.replace(" ", "");

        int[] arr = new int[26];

        for (int i : arr) {
            arr[i] = 0;
        }

        for (int i = 0; i < s1.length(); i++) {

            int c = s1.charAt(i);
            int index = c - 'a';

            arr[index] += 1;
        }

        int maxValue = 0;
        int maxIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > maxValue) {
                maxValue = arr[i];
                maxIndex = i;
            }
        }

        char resultAlpha = (char) (maxIndex + 'a');

        return resultAlpha + "가 " + maxValue + "번으로 가장 많이 나왔습니다.";
    }

}
