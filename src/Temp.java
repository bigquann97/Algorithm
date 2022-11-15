public class Temp {
    public static void main(String[] args) {

        int n = 20;

        int sum = 0;

        for (int i = n; i > 0; i--) {
            if(n % 2 == 0) {
                sum += i;
            }
        }

        System.out.println("sum = " + sum);
    }
}


// 정수 n이 주어질때 n 이하의 짝수 모두 더한 값을 return