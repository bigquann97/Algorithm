package sparta.week2;

import java.util.ArrayList;

public class Q10_1 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int k = 1;
        for (int i = 0; i < 10; i++) {
            arrayList.add(i);
        }

        Integer result = logic(arrayList, k);
        System.out.println("result = " + result);
    }

    private static Integer logic(ArrayList<Integer> arrayList, int k) {
        Integer result = arrayList.get(k - 1);
        return result;
    }
}

//Q. 링크드 리스트의 끝에서 K번째 값을 반환하시오.