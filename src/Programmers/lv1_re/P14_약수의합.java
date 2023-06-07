package Programmers.lv1_re;
/*
    정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.
 */
public class P14_약수의합 {
    public int solution(int n) {
        int answer = 0;

        // 1부터 n까지의 숫자가 약수인지 확인
        for (int i = 1; i <= n / 2; i++) { // 효울성으로 절반까지만 확인
            if (n % i == 0) { // n을 i의 수로 나누어 떨어지면 약수
                answer += i;
            }
        }

        return answer + n; // n 자신도 약수에 포함되므로 추가로 더해줌
    }
    public static void main(String[] args) {
        P14_약수의합 q = new P14_약수의합();

        int n = 12;
        System.out.println(q.solution(n));
    }
}
