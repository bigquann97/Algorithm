class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        int i = 0;
        for (String s : quiz) {
            String sik = s.split(" = ")[0];
            Integer dap = Integer.valueOf(s.split(" = ")[1]);

            if (sik.contains(" - ")) {
                int a = Integer.parseInt(sik.split(" - ")[0]);
                int b = Integer.parseInt(sik.split(" - ")[1]);
                if (a - b == dap) {
                    answer[i++] = "O";
                } else{
                    answer[i++] = "X";
                }
            } else {
                int a = Integer.parseInt(sik.split(" \\+ ")[0]);
                int b = Integer.parseInt(sik.split(" \\+ ")[1]);
                if (a + b == dap) {
                    answer[i++] = "O";
                } else{
                    answer[i++] = "X";
                }
            }
        }

        return answer;
    }
}