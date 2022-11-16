package programmers.level0;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * 최댓값 만들기 1
 * https://school.programmers.co.kr/learn/courses/30/lessons/120847
 */
public class Code120847 {
}

class Code120847_1 {
    public int solution(int[] numbers) {
        int max = numbers[0];
        int max2 = numbers[0];
        int maxIndex = 0;

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] > max) {
                max = numbers[i];
                maxIndex = i;
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] <= max && numbers[i] > max2 && maxIndex != i) {
                max2 = numbers[i];
            }
        }

        return max * max2;
    }
}

/*



                ArrayList<Integer> arr = new ArrayList<>();
        for (int number : numbers) {
            arr.add(number);
        }

        arr.sort(Comparator.reverseOrder());

        return arr.get(0) * arr.get(1);

 */