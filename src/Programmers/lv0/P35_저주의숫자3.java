package Programmers.lv0;
/*
    정수 n이 매개변수로 주어질 때, n을 3x 마을에서 사용하는
    숫자로 바꿔 return 하도록 solution 함수를 완성해주세요.
 */



public class P35_저주의숫자3 {
    public static int solution(int n) {
        int answer = n;

        // n 번째반복했을 때 빠진 수 만큼 n에 추가
        for (int i = 1; i <= answer; i++) {
            // 3의배수와 3이 포한된 수 추가하여 돌림
            if (i%3 == 0 || String.valueOf(i).contains("3")) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        int n = 40;
        System.out.println(solution(n));
    }

}
