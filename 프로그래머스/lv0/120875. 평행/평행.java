import java.util.ArrayList;

class Solution {
    public int solution(int[][] dots) {
        int answer = 0;

        ArrayList<Double> giList = new ArrayList<>();

        for(int i = 0; i < 4; i ++) {
            for (int j = i + 1; j < 4; j++) {
                Double gi = 0.0d;
                if (dots[i][0] < dots[j][0]) {
                    gi = (double) (dots[j][1] - dots[i][1]) / (double) (dots[j][0] - dots[i][0]);
                    giList.add(gi);
                } else {
                    gi = (double) (dots[i][1] - dots[j][1]) / (double) (dots[i][0] - dots[j][0]);
                    giList.add(gi);
                }
            }
        }

        for (int i = 0; i < giList.size() - 1; i++) {
            for (int j = i + 1; j < giList.size(); j++) {
                if (giList.get(i).equals(giList.get(j))) {
                    return 1;
                }
            }
        }
        
        return 0;
    }
}