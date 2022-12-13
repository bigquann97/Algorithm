class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int[][] zone = new int[board.length][board[0].length]; // 0 으로 모두 초기화 - 0 safe 1 danger

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 1) { // 폭탄 발견
                    zone[i][j]++;

                    if(i != 0)
                        zone[i - 1][j]++;

                    if(j != 0)
                        zone[i][j - 1]++;

                    if(i != 0 && j != 0)
                        zone[i - 1][j - 1]++;

                    if(j != board.length - 1)
                        zone[i][j + 1]++;

                    if(i != board.length - 1)
                        zone[i + 1][j]++;

                    if(i != board.length - 1 && j != board.length - 1)
                        zone[i + 1][j + 1]++;

                    if(i != board.length - 1 && j != 0)
                        zone[i + 1][j - 1]++;

                    if(i != 0 && j != board.length - 1)
                        zone[i - 1][j + 1]++;
                }
            }
        }

        for (int i = 0; i < zone.length; i++) {
            for (int j = 0; j < zone[i].length; j++) {
                if(zone[i][j] == 0) {
                    answer++;
                }
            }
        }

        return answer;
    }
}