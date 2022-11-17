package programmers.level1;

import java.util.ArrayList;

public class Code12921 {
    public static void main(String[] args) {
        Code12921_1 a = new Code12921_1();
        a.solution(5);
    }
}

class Code12921_1 {
    public int solution(int n) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 2; i <= n; i++) {
            if(isSosu(i)) {
                arrayList.add(i);
            }
        }

        return arrayList.size();
    }


    public static boolean isSosu(int num){
        if(num < 2) return false;
        if(num == 2) return true;
        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
