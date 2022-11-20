package baekjoon.temp;

import java.util.ArrayList;
import java.util.Scanner;

class Temp {
    public static void main(String[] args) {
        ArrayList<String> answer = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String a = scanner.nextLine();

            if (a.equals(".")) {
                break;
            }

            ArrayList<Character> arr = new ArrayList<>();
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) == '(' || a.charAt(i) == ')' || a.charAt(i) == '[' || a.charAt(i) == ']') {
                    arr.add(a.charAt(i));
                }
            }
            int temp = arr.size();


            for (int i = 0; i < temp / 2; i++) {
                for (int j = 0; j < arr.size() - 1; j++) {
                    if (arr.get(j).equals('(') && arr.get(j + 1).equals(')')) {
                        arr.remove(j+1);
                        arr.remove(j);
                        break;
                    } else if (arr.get(j).equals('[')&& arr.get(j + 1).equals(']')) {
                        arr.remove(j+1);
                        arr.remove(j);
                        break;
                    }
                }
            }

            if(arr.size() == 0) {
                answer.add("yes");
            } else {
                answer.add("no");
            }
        }

        for (String s : answer) {
            System.out.println(s);
        }
    }

}
