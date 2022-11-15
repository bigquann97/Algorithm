package sparta.week2;

import java.util.ArrayList;

public class Q6_1 {

    public static void main(String[] args) {

        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();

        arr1.add(6);
        arr1.add(7);
        arr1.add(8);
        arr2.add(3);
        arr2.add(5);
        arr2.add(4);

        int result = algo(arr1, arr2);
        System.out.println("result = " + result);
    }

    private static int algo(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {

        String first = "";
        String second = "";

        for (int i = 0; i < arr1.size(); i++) {
            first += arr1.get(i).toString();
            second += arr2.get(i).toString();
        }

        return Integer.valueOf(first) + Integer.valueOf(second);


    }

}
