import java.util.Arrays;
import java.util.Comparator;

public class Programmers {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] board = new int[][]{
                {0}
        };

        System.out.println(solution.solution(board));

    }
}

//            {0, 0, 0, 0, 0},
//            {0, 0, 0, 0, 0},
//            {0, 0, 0, 0, 0},
//            {0, 0, 1, 0, 0},
//            {0, 0, 0, 0, 0}

/*
i-1 j-1
i-1 j
i-1 j+1

i j-1
i j
i j+1

i+1 j-1
i+1 j
i+1 j+1
 */

class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int size = board.length;
        int[][] zone = new int[size][size]; // 0 으로 모두 초기화 - 0 safe 1 danger

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == 1) { // 폭탄 발견
                    zone[i][j]++;

                    if(i != 0)
                        zone[i - 1][j]++;

                    if(j != 0)
                        zone[i][j - 1]++;

                    if(i != 0 && j != 0)
                        zone[i - 1][j - 1]++;

                    if(j != size - 1)
                        zone[i][j + 1]++;

                    if(i != size - 1)
                        zone[i + 1][j]++;

                    if(i != size - 1&& j != size - 1)
                        zone[i + 1][j + 1]++;

                    if(i != size - 1 && j != 0)
                        zone[i + 1][j - 1]++;

                    if(i != 0 && j != size - 1)
                        zone[i - 1][j + 1]++;
                }
            }
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if(zone[i][j] == 0) {
                    answer++;
                }
            }
        }

        return answer;
    }
}