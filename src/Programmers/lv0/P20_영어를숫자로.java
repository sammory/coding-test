package Programmers.lv0;

// 영어가싫어요
public class P20_영어를숫자로 {
    public static long solution(String numbers) {
        long answer = 0;
        String transNum = numbers.replace("zero","0")
                .replace("one","1")
                .replace("two","2")
                .replace("three","3")
                .replace("four","4")
                .replace("five","5")
                .replace("six","6")
                .replace("seven","7")
                .replace("eight","8")
                .replace("nine","9");

        answer = Long.parseLong(transNum);

        return answer;
    }

    public static void main(String[] args) {

        String numbers = "onetwothreefourfivesixseveneightnine";

        System.out.println(solution(numbers));
    }


}
