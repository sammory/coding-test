package Programmers.lv1;
/*
    두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수, solution을 완성하세요.
    예를 들어 a = 3, b = 5인 경우, 3 + 4 + 5 = 12이므로 12를 리턴합니다.
 */
public class P50_두정수사이합 {
    public static long solution(int a, int b) {
        long answer = 0;
        long min = Math.min(a,b);
        long max = Math.max(a,b);

        for (long i = min; i <= max; i++) {
            answer += i;
        }

        return answer;
    }

    public static void main(String[] arg) {

        int a = 3;
        int b = 5;
        System.out.println(solution(a,b));
    }
}
