class Solution {
    public long solution(String numbers) {
        long answer = 0;
        String tempAnswer = "";
        while(numbers.length() != 0) {
            int num = 0;
            if(numbers.startsWith("zero")) {
                num = 0;
                numbers = numbers.replaceFirst("zero", "");
            } else if (numbers.startsWith("one")) {
                num = 1;
                numbers = numbers.replaceFirst("one", "");
            } else if (numbers.startsWith("two")) {
                num = 2;
                numbers = numbers.replaceFirst("two", "");
            } else if (numbers.startsWith("three")) {
                num = 3;
                numbers = numbers.replaceFirst("three", "");
            } else if (numbers.startsWith("four")) {
                num = 4;
                numbers = numbers.replaceFirst("four", "");
            } else if (numbers.startsWith("five")) {
                num = 5;
                numbers = numbers.replaceFirst("five", "");
            } else if (numbers.startsWith("six")) {
                num = 6;
                numbers = numbers.replaceFirst("six", "");
            } else if (numbers.startsWith("seven")) {
                num = 7;
                numbers = numbers.replaceFirst("seven", "");
            } else if (numbers.startsWith("eight")) {
                num = 8;
                numbers = numbers.replaceFirst("eight", "");
            } else if (numbers.startsWith("nine")) {
                num = 9;
                numbers = numbers.replaceFirst("nine", "");
            }
            tempAnswer += String.valueOf(num);
        }
        answer = Long.parseLong(tempAnswer);
        return answer;
    }
}


/*
1. 공백 X 영어 => 숫자
2. zero는 맨앞에 X
numbers 처음부터 순회 => 가장 처음 만난 단어 체크
=> 해당 단어 숫자화 + 자릿수 판단 => answer 에 집어넣기
numbers String 값 없애기
*/