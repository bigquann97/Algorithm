class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        int i = 0;

        for (String s : quiz) {
            if (s.contains(" + ")) {
                String[] start = s.split(" \\+ ");
                String[] end = start[1].split(" = ");
                String a = start[0];
                String b = end[0];
                String c = end[1];
                int z = Integer.parseInt(a);
                int x = Integer.parseInt(b);
                int v = Integer.parseInt(c);
                if (z + x == v)
                    answer[i++] = "O";
                else
                    answer[i++] = "X";
            } else {
                String[] start = s.split(" - ");
                String[] end = start[1].split(" = ");
                String a = start[0];
                String b = end[0];
                String c = end[1];
                int z = Integer.parseInt(a);
                int x = Integer.parseInt(b);
                int v = Integer.parseInt(c);
                if (z - x == v)
                    answer[i++] = "O";
                else
                    answer[i++] = "X";
            }

        }
        return answer;
    }
}