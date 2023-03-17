package Programmers.lv1;

public class P58_약수의합 {
    public int solution(int n) {
        int answer = 0;
        // 약수는 차례대로 n번째 숫자까지 나누어 떨어지는 수
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) answer += i;
        }

        return answer;
    }
    public static void main(String[] args) {
        P58_약수의합 q = new P58_약수의합();

        int n = 12;
        System.out.println(q.solution(n));
    }
}
