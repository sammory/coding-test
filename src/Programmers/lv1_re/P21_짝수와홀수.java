package Programmers.lv1_re;

public class P21_짝수와홀수 {
    public String solution(int num) {
        String answer = "Odd";

        // 홀수일 경우
        if (num % 2 == 0) {
            return "Even";
        }

        return answer;
    }
    public static void main(String[] args) {
        P21_짝수와홀수 q = new P21_짝수와홀수();

        int num = 2;
        System.out.println(q.solution(num));
    }
}
