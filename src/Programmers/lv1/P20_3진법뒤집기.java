package Programmers.lv1;
/*
자연수 n이 매개변수로 주어집니다. n을 3진법 상에서 앞뒤로 뒤집은 후,
이를 다시 10진법으로 표현한 수를 return 하도록 solution 함수를 완성해주세요.
 */
public class P20_3진법뒤집기 {
    public static int solution(int n) {
        String num = "";

        while (n != 0) {
                num += n % 3;
                n /= 3;
            }

        return Integer.parseInt(num, 3);
    }
    public static void main(String[] args) {

        int n = 45;
        System.out.println(solution(n));
    }
}
