import java.util.ArrayList;


class Solution {
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
