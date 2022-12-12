class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        int i = 0;
        for (String s : quiz) {
            String sik = s.split(" = ")[0];
            String dapStr = s.split(" = ")[1];

            if (sik.contains(" - ")) {
                int a = Integer.parseInt(sik.split(" - ")[0]);
                int b = Integer.parseInt(sik.split(" - ")[1]);
                int dap = Integer.parseInt(dapStr);
                answer[i++] = a - b == dap ? "O" : "X";
            } else {
                int a = Integer.parseInt(sik.split(" \\+ ")[0]);
                int b = Integer.parseInt(sik.split(" \\+ ")[1]);
                int dap = Integer.parseInt(dapStr);
                answer[i++] = a + b == dap ? "O" : "X";
            }
        }
        return answer;
    }
}