package sparta.week3;

public class Code01_BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[]{4, 6, 2, 9, 1};
        int[] result = bubbleSort(arr);
        for (int i : result) {
            System.out.println("i = " + i);
        }
    }

    private static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) { // i 단계
            for (int j = 0; j < arr.length - 1 - i; j++) { // i-j 단계
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        return arr;
    }
}
