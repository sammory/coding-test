package Programmers.lv1;
/*
    1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환하는 함수, solution을 만들어 보세요.
 */
public class P59_소수찾기 {
    public int solution(int n) {
        int answer = 0;

        for (int i = 2; i <= n; i++) {
            boolean check = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                // 나누어 떨어지면 소수가 아님
                if (i % j == 0) {
                    check = false;
                    break;  // 효율성을 위해
                }
            }
            // 소수가 맞으면 answer 추가
            if (check) answer++;
        }

        return answer;
    }
    public static void main(String[] args) {
        P59_소수찾기 q = new P59_소수찾기();

        int n = 5;
        System.out.println(q.solution(n));
    }
}
