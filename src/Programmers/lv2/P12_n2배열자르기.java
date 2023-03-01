package Programmers.lv2;

public class P12_n2배열자르기 {
    public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int)(right - left) + 1];

        int idx = 0;
        for (long i = left; i <= right; i++) {
            // i/n(행값), i%n(열값)
            answer[idx++] = (int)Math.max(i / n, i % n) + 1;
        }

        return answer;
    }
    public static void main(String[] args) {
        P12_n2배열자르기 q = new P12_n2배열자르기();

        int n = 3;
        int left = 2;
        int right = 5;
        System.out.println(q.solution(n,left,right));
    }
}
