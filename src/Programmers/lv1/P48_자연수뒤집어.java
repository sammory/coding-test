package Programmers.lv1;

public class P48_자연수뒤집어 {
    public static int[] solution(long n) {
        int[] answer = new int[(int) Math.log10(n)+1];
        long num = 0;
        int cnt = 0;

        while (n > 0) {
            num = n % 10;
            n /= 10;
            answer[cnt] = (int)num;
            cnt++;
        }
        return answer;
    }
    public static void main(String[] arg) {
        int n = 12345;
        System.out.println(solution(n));
    }
}
