package sparta.week2;

import java.util.ArrayList;

public class Q10_3 {
    public static void main(String[] args) {
        int[] numbers = new int[]{2, 6, 3};
        int target = 5;

        int count = logic(numbers, target);
        System.out.println("count = " + count);
    }

    private static int logic(int[] numbers, int target) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int number : numbers) {
            arrayList.add(number);
        }
        return 0;
    }
}

/*
Q. 음이 아닌 정수들로 이루어진 배열이 있다. 이 수를 적절히 더하거나 빼서 특정한 숫자를 만들려고 한다.
예를 들어 [1, 1, 1, 1, 1]로 숫자 3을 만들기 위해서는 다음 다섯 방법을 쓸 수 있다.

-1+1+1+1+1 = 3
+1-1+1+1+1 = 3
+1+1-1+1+1 = 3
+1+1+1-1+1 = 3
+1+1+1+1-1 = 3

사용할 수 있는 숫자가 담긴 배열 numbers, 타겟 넘버 target_number이 매개변수로 주어질 때 숫자를 적절히 더하고 빼서 타겟 넘버를 만드는 방법의 수를 반환하시오.
 */