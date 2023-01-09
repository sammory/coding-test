package Programmers.lv1;
/*
두 정수 left와 right가 매개변수로 주어집니다. left부터 right까지의 모든 수들 중에서,
약수의 개수가 짝수인 수는 더하고, 약수의 개수가 홀수인 수는 뺀 수를 return 하도록 solution 함수를 완성해주세요.
 */
public class P15_약수의개수와덧셈 {
    public static int solution(int left, int right) {
        int answer = 0;

        for (int i = left; i <= right; i++) {    // left 부터 right 의 횟수만큼 반복문
            int cnt = 0;
            for (int j = 1; j <= i; j++) {       // 해당 숫자에 약수 총 숫자를 cnt 로 담음
                if (i % j == 0) {
                    cnt++;
                }

            }
            if (cnt % 2 == 0) {                  // 짝수일때는 더해주고 홀수일때는 배줌
                answer += i;
            } else {
                answer -= i;
            }
        }

        return answer;
    }

    /* 제곱수를 활용한 풀이
     for (int i=left;i<=right;i++) {
            //제곱수인 경우 약수의 개수가 홀수
            if (i % Math.sqrt(i) == 0) {
                answer -= i;
            }
            //제곱수가 아닌 경우 약수의 개수가 짝수
            else {
                answer += i;
            }
        }
     */

    public static void main(String[] args) {

        int left = 13;
        int right = 17;
        System.out.println(solution(left, right));
    }
}
