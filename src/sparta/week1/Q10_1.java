package sparta.week1;

import java.util.ArrayList;

public class Q10_1 {
    public static void main(String[] args) {
        String input = "aaaaaaa ";
        char logic = logic(input);
        System.out.println("logic = " + logic);
    }

    private static char logic(String input) {
        String s = input.toLowerCase();

        int[] arr = new int[26];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(isAlpha(c)) {
                int index = c - 'a';
                arr[index] += 1;
            }
        }

        ArrayList<Character> arrayList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 1) {
                arrayList.add((char)(i + 'a'));
            }
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(arrayList.contains(c)) {
                return c;
            }
        }

        return '_';
    }

    private static boolean isAlpha(char c) {
        if(c >= 'A' && c <= 'z') {
            return true;
        } else{
            return false;
        }
    }
}