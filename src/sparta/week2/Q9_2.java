package sparta.week2;

public class Q9_2 {
    public static void main(String[] args) {
        String input = " ";
        boolean result = logic(input);
        System.out.println("result = " + result);
    }

    private static boolean logic(String input) {
        if (input.length() % 2 == 0) {
            return false;
        }

        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - i - 1)) {
                return false;
            }
        }

        return true;
    }
}
