package sparta.week1;

public class Q4_1 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 10, 3, 2};
        int result = logic(arr);
        System.out.println("result = " + result);
    }

    private static int logic(int[] arr) {
        int max = 0;
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }

        System.out.println("인덱스는 " + index + "입니다.");
        return max;
    }


}
