package Programmers.lv1_re;
/*
    두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수, solution을 완성하세요.
 */
public class P04_두정수사이의합 {
    public long solution(int a, int b) {
        long answer = 0;
        // a와 b의 최소 초대값을 입력
        long min = Math.min(a,b);
        long max = Math.max(a,b);

        // 최소값부터 초대값까지 반복문으로 더하기
        for (long i = min; i <= max; i++) {
            answer += i;
        }

        return answer;
    }
    public static void main(String[] args) {
        P04_두정수사이의합 q = new P04_두정수사이의합();

        int a = 3;
        int b = 5;
        System.out.println(q.solution(a,b));
    }
}
