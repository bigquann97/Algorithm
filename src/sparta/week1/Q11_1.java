package sparta.week1;

import java.util.ArrayList;
import java.util.Scanner;

public class Q11_1 {

    public static void main(String[] args) {
        // 숫자 입력받고
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        // 입력받은 숫자 파리미터로 넘겨서 로직 타러 가기
        ArrayList<Integer> logic = logic(input);

        int[] arr = new int[logic.size()];

        System.out.println("logic = " + logic);

        for (int i = 0; i < logic.size(); i++) {
            arr[i] = logic.get(i);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[i] = " + arr[i]);
        }

    }

    // 로직
    private static ArrayList<Integer> logic(int input) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 2; i < input; i++) {
            if (isSosu(i)) {
                arrayList.add(i);
            }
        }
        return arrayList;
    }

    //
    private static boolean isSosu(int input) { // 그게 맞는 것 같습니다. -
        for (int i = input - 1; i > 1; i--) {
            if(input % i == 0) {
                return false;
            }
        }
        return true;
    }
}