package Programmers;

//자릿수 더하기

public class P09_자릿수더하기 {

    public static int solution(int n) {
        int answer = 0;

        while (n > 0) {
            answer += n % 10;
            n /= 10;
        }
        return answer;
    }

    public static void main(String[] args) {

        int n = 2345;

        System.out.println(solution(n));

    }
}