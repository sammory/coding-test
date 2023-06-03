package Programmers.lv1_re;
/*
    1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환하는 함수, solution을 만들어 보세요.
    소수는 1과 자기 자신으로만 나누어지는 수를 의미합니다.
 */
public class P10_소수찾기 {
    public int solution(int n) {
        int answer = 0;

        for (int i = 2; i <= n; i++) {  // 1을 제외하고 n까지 반복, 1은 소수가 아님
            boolean check = true;

            // 중복값을 제거하기 위해 Math.sqrt(i)은 루트값까지만 반복
            // 이중 for문으로 i의 값이 소수인지 판별
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    check = false;   // 소수가 아닌경우 false
                    break;     // 효율성을 위해 정지
                }
            }
            // 소수가 맞으면 answer 추가
            if (check) answer++;
        }

        return answer;
    }
    public static void main(String[] args) {
        P10_소수찾기 q = new P10_소수찾기();

        int n = 36;
        System.out.println(q.solution(n));
    }
}
