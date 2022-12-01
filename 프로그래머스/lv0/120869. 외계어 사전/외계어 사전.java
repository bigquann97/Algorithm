class Solution {
    public int solution(String[] spell, String[] dic) {

        for (String dicc : dic) {
            boolean flag = true;
            for (String spel : spell) {
                if(! dicc.contains(spel)) {
                    flag = false;
                    break;
                } else {
                    dicc = dicc.replaceFirst(spel, "");
                }
            }
            if(dicc.length() == 0 && flag == true)
                return 1;
        }
        return 2;
    }
}