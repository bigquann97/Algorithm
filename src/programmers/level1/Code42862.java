package programmers.level1;

import java.util.ArrayList;

/**
 * 체육복
 * https://school.programmers.co.kr/learn/courses/30/lessons/42862
 */
public class Code42862 {
    public static void main(String[] args) {
        int n = 5;
        int[] lost = new int[]{2, 4};
        int[] reserve = new int[]{1, 3, 5};

        Code42862_1 a = new Code42862_1();
        a.solution(n, lost, reserve);

    }
}

class Code42862_1 {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }
        for (int i : lost) {
            arr[i - 1]--;
        }
        for (int i : reserve) {
            arr[i - 1]++;
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) {
            }
        }


        for (int i : arr) {
            System.out.print(i + " ");
        }


        return 0;
    }
}

/*
        int answer = 0;
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(1);
        }

        for (int i : reserve) {
            arr.set(i - 1, arr.get(i - 1) + 1);
        }

        for (int i : lost) {
            arr.set(i - 1, arr.get(i - 1) - 1);
        }

        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == 0) {
                if(i == 0) {
                    if(arr.get(i + 1) == 2) {
                        arr.set(i, 1);
                        arr.set(i + 1, 1);
                    }
                } else if (i == arr.size() - 1) {
                    if(arr.get(i - 1) == 2) {
                        arr.set(i, 1);
                        arr.set(i - 1, 1);
                    }
                } else {
                    if(arr.get(i - 1) == 2) {
                        arr.set(i, 1);
                        arr.set(i - 1, 1);
                    } else if (arr.get(i + 1) == 2) {
                        arr.set(i, 1);
                        arr.set(i + 1, 1);
                    }
                }
            }
        }

        for (Integer integer : arr) {
            if(integer >= 1)
                answer += 1;
        }

        return answer;
 */