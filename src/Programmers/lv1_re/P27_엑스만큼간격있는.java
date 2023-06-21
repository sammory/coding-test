package Programmers.lv1_re;

public class P27_엑스만큼간격있는 {
    public long[] solution(long x, int n) {
        long[] answer = new long[n];

        // x의 값 만큼 반복해서 추가
        for (int i = 1; i <= n; i++) {
            answer[i - 1] = x * i;
        }

        return answer;
    }
    public static void main(String[] args) {
        P27_엑스만큼간격있는 q = new P27_엑스만큼간격있는();

        int x = 2;
        int n = 5;
        System.out.println(q.solution(x, n));
    }
}
