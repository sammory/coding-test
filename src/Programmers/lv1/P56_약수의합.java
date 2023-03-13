package Programmers.lv1;
/*
    정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.
 */
public class P56_약수의합 {
    public int solution(int n) {
        int answer = 0;
        int sqrt = (int)Math.sqrt(n);

        for (int i = 1; i <= sqrt; i++) {
            if (n % i == 0) {
                answer += i;
                if (n / i != i) {
                    answer += n / i;
                }
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        P56_약수의합 q = new P56_약수의합();

        int n = 12;
        System.out.println(q.solution(n));
    }
}
