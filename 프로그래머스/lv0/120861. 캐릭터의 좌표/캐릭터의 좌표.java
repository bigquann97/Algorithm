class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[]{0, 0};
        int i = board[0] / 2; // 가로 최대  5
        int j = board[1] / 2; // 세로 최대  4

        for (String input : keyinput) {
            switch (input) {
                case "left":
                    if(checkLeftPossible(answer, i))
                        answer[0]--;
                    break;
                case "right":
                    if(checkRightPossible(answer, i))
                        answer[0]++;
                    break;
                case "down":
                    if(checkDownPossible(answer, j))
                        answer[1]--;
                    break;
                case "up":
                    if(checkUpPossible(answer, j))
                        answer[1]++;
                    break;
            }
        }
        return answer;
    }

    private boolean checkLeftPossible(int[] answer, int i) {
        return answer[0] > -i;
    }

    private boolean checkRightPossible(int[] answer, int i) {
        return answer[0] < i;
    }

    private boolean checkDownPossible(int[] answer, int i) {
        return answer[1] > -i;
    }

    private boolean checkUpPossible(int[] answer, int i) {
        return answer[1] < i;
    }


}