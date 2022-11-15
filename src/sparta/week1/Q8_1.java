package sparta.week1;

public class Q8_1 {

    public static void main(String[] args) {

        int[] arr = new int[]{3, 5, 6, 1, 2, 4};
        int target = 3;
        boolean result = logic(arr, target);

        System.out.println("result = " + result);
    }

    private static boolean logic(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                return true;
            }
        }
        return false;
    }


}
