package Programmers.lv1;
/*
    자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
    예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.
 */
public class P55_자릿수더하기 {
    public int solution(int n) {
        int answer = 0;
        int temp = 0;

        while (n >= 1) {
            temp = n % 10;
            answer += temp;
            n = n / 10;
        }

        return answer;
    }
    public static void main(String[] args) {
        P55_자릿수더하기 q = new P55_자릿수더하기();

        int n = 123;
        System.out.println(q.solution(n));
    }
}
