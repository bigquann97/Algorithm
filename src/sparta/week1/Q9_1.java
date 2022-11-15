package sparta.week1;

public class Q9_1 {

    public static void main(String[] args) {

        int[] input = new int[]{3, 2, 1, 5, 9, 7, 4};
        int result = logic(input);
        System.out.println("result = " + result);

    }

    private static int logic(int[] input) {
        int result = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] <= 1 || result == 0) {
                result += input[i];
            } else {
                result *= input[i];
            }
        }
        return result;
    }
}
