package Programmers.lv1_re;

public class P22_최대공약수최소공배수 {
    public int[] solution(int n, int m) {

        int max = Math.max(n,m);
        int min = Math.min(n,m);

        // 최대공약수
        while (min != 0) {
            int r = max % min;
            max = min;
            min = r;
        }
        // 최소 공배수 = 두수의 곱 / 최대공약수
        int gcd = n * m / max;

        int[] answer = {max, gcd};

        return answer;
    }
    public static void main(String[] args) {
        P22_최대공약수최소공배수 q = new P22_최대공약수최소공배수();

        int n = 2;
        int m = 2;
        System.out.println(q.solution(n, m));
    }
}
