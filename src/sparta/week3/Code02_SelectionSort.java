package sparta.week3;

public class Code02_SelectionSort {
    public static void main(String[] args) {
        int[] arr = new int[]{4, 6, 2, 9, 1};
        int[] result = selectionSort(arr);
        for (int i : result) {
            System.out.println("i = " + i);
        }
    }

    private static int[] selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = 0; j < n - i; j++) {
                if (arr[i + j] < arr[minIndex]) {
                    minIndex = i + j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        return arr;
    }
}


