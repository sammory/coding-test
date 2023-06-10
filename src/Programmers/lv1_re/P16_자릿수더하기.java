package Programmers.lv1_re;
/*
    자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
    예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.
 */
public class P16_자릿수더하기 {
    public int solution(int n) {
        int answer = 0;
        int s = 0;

        // n의 값이 1의자리까지 나누어질동안 반복
        while (n >= 1) {
            s = n % 10; // 나머지값을 저장
            n /= 10;    // 자릿수 자르기
            answer += s;
        }

        return answer;
    }
    public static void main(String[] args) {
        P16_자릿수더하기 q = new P16_자릿수더하기();

        int n = 123;
        System.out.println(q.solution(n));
    }
}
