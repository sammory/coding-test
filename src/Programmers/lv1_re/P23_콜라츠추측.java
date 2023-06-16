package Programmers.lv1_re;

public class P23_콜라츠추측 {
    public int solution(int num) {
        int cnt = 0;
        long n = num; // int의 최대 길이를 벗어나기 때문에 long 타입으로 변환

        // n이 1보다 클때까지 반복
        while (n > 1) {
            if (n % 2 == 0) { // 짝수일때
                n /= 2;
            } else {
                n = n * 3 + 1; // 홀수일때
            }
            cnt++; // 반복횟수
            if (cnt == 500) {
                return -1;
            }
            if (n == 1) {
                return cnt;
            }
        }

        return cnt;
    }
    public static void main(String[] args) {
        P23_콜라츠추측 q = new P23_콜라츠추측();

        int num = 626331;
        System.out.println(q.solution(num));
    }
}
