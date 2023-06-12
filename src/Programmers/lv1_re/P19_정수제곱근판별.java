package Programmers.lv1_re;
/*
    임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
    n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.
 */
public class P19_정수제곱근판별 {
    public long solution(long n) {
        long answer = 0;
        long s = (long) Math.sqrt(n); // n의 제곱근 구하기

        if (n == Math.pow(s, 2)) { // s의 제곱근 구하기, 2승
            answer = (long) Math.pow(s + 1, 2);
        } else {
            return -1;
        }
        return answer;
    }
    public static void main(String[] args) {
        P19_정수제곱근판별 q = new P19_정수제곱근판별();

        long n = 121;
        System.out.println(q.solution(n));
    }
}
