package Programmers.lv1;

public class P37_콜라츠추측 {
    public static int solution(int num) {
        int answer = 0;
        int cnt = 0;
        long s = num;

        while (s > 1) {
            if (s % 2 == 0) {
                s /= 2;
            } else {
                s = (s * 3) + 1;
            }
            cnt++;
            if (cnt == 500) {
                return -1;
            }
            if (s == 1) {
                return cnt;
            }
        }

        return answer;
    }
    public static void main(String[] args) {

        int num = 626331;
        System.out.println(solution(num));
    }
}
