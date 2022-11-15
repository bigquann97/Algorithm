package sparta.week3;

public class Code03_InsertionSort {
    public static void main(String[] args) {
        int[] arr = new int[]{6, 4, 2, 9, 1};

        int[] result = insertionSort(arr);

        for (int i : result) {
            System.out.println("i = " + i);
        }
    }

    private static int[] insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i - j - 1] > arr[i - j]) {
                    int temp = arr[i - j - 1];
                    arr[i - j - 1] = arr[i - j];
                    arr[i - j] = temp;
                } else {
                    break;
                }
            }
        }

        return arr;
    }
}
