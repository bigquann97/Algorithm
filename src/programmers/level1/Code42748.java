package programmers.level1;

import java.util.Arrays;

/**
 * K번재 수
 * https://school.programmers.co.kr/learn/courses/30/lessons/42748
 *
 * - for 문 내 멤버변수 초기화 하지 않도록
 * - index 신경쓰기
 */
public class Code42748 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 5, 2, 6, 3, 7, 4};
        int[][] commands = new int[][]{new int[]{2, 5, 3}, new int[]{4, 4, 1}, new int[]{1, 7, 3}};

        Code42748_1 a = new Code42748_1();
        int[] solution = a.solution(array, commands);

        for (int i = 0; i < solution.length; i++) {
            System.out.println("solution[i] = " + solution[i]);
        }
    }
}


class Code42748_1 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int[] command = commands[i];

//            [1, 5, 2, 6, 3, 7, 4]
//            [[2, 5, 3], [4, 4, 1], [1, 7, 3]]
//            [5, 6, 3]
            int[] arr = new int[command[1] - command[0] + 1];

            for (int i1 = 0; i1 < arr.length; i1++) {
                arr[i1] = array[i1 + command[0] - 1];
            }

            Arrays.sort(arr);
            answer[i] = arr[command[2] - 1];
        }
        return answer;
    }
}