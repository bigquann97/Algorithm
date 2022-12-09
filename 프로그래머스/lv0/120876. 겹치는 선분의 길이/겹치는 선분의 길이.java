class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int[] table = new int[201];

        // -100 ~ 0 , 0 ~ 100
        // 0 ~ 100 , 100 ~ 200
        for (int i = 0; i < lines.length; i++) {
            int p1 = lines[i][0];
            int p2 = lines[i][1];
            int startP = Math.min(p1, p2);
            int endP = Math.max(p1, p2);
            int length = endP - startP;
            for (int j = 0; j < length; j++) {
                table[startP + 100] += 1;
                startP++;
            }
        }

        for (int i = 0; i < table.length; i++) {
            if(table[i] >= 2) {
                answer++;
            }
        }
        return answer;
    }
}