package sparta.week3;

import java.util.ArrayList;

public class Code04_MergeSort {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3, 5};
        int[] arr2 = new int[]{4, 6, 7, 8};
        ArrayList<Integer> result = merge(arr1, arr2);
        System.out.println("result = " + result);
    }




    private static ArrayList<Integer> merge(int[] arr1, int[] arr2) {
        ArrayList<Integer> result = new ArrayList<>();

        int array1Index = 0;
        int array2Index = 0;

        while (array1Index < arr1.length && array2Index < arr2.length) {
            if (arr1[array1Index] < arr2[array2Index]) {
                result.add(arr1[array1Index]);
                array1Index += 1;
            } else {
                result.add(arr2[array2Index]);
                array2Index += 1;
            }
        }

        if (array1Index == arr1.length) {
            while (array2Index < arr2.length) {
                result.add(arr2[array2Index]);
                array2Index += 1;
            }
        }

        if (array2Index == arr2.length) {
            while (array1Index < arr1.length) {
                result.add(arr1[array1Index]);
                array1Index += 1;
            }
        }

        return result;
    }
}
