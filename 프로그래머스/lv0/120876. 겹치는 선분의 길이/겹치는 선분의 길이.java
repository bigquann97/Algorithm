
class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int[] table = new int[250];

        // 0 1 / 2 5 / 3 9
        for (int i = 0; i < lines.length; i++) {
            int endP = Math.max(lines[i][0], lines[i][1]);
            int startP = Math.min(lines[i][0], lines[i][1]);
            int temp = startP;
            for (int j = 0; j < endP - startP; j++) {
                table[temp++ + 125] += 1;
            }
        }

        for (int dap : table) {
            if(dap >= 2)
                answer++;
        }
        return answer;
    }
}