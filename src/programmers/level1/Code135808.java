package programmers.level1;


import java.util.Arrays;
import java.util.Comparator;

public class Code135808 {

    public static void main(String[] args) {
        int k = 4;
        int m = 3;
        int[] score = new int[]{4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};

        Code135808_1 a = new Code135808_1();
        int solution = a.solution(k, m, score);
        System.out.println("solution = " + solution);
    }

}

class Code135808_1 {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Integer[] a = new Integer[score.length];

        for (int i = 0; i < score.length; i++) {
            a[i] = score[i];
        }

        Arrays.sort(a, Comparator.reverseOrder());

        int count = score.length / m;
        int p = 0;

        for (int i = 0; i < count; i++) {
            Integer[] integers = Arrays.copyOfRange(a, p, p + m);
            answer += integers[m - 1] * m;
            p = p + m;
        }

        return answer;
    }
}