package sparta.timeAttack;

class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "fail";
        String id = id_pw[0];
        String pw = id_pw[1];
        for (String[] target : db) {
            if (id.matches(target[0])) {
                if (pw.matches(target[1])) {
                    answer = "login";
                    break;
                }
                answer = "wrong pw";
                break;
            }
        }
        return answer;
    }
}

// .equals 비교 , == 비교
// String 비교할때는 == 쓰면은 안된다
// equals
// matches