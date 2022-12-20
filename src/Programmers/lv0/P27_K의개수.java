package Programmers.lv0;

public class P27_K의개수 {

    public static int solution(int i, int j, int k) {
        int answer = 0;

        for (int m = i; m <= j; m++) {
            int num = m;
            while (num != 0) {
                if (num % 10 == k)   // 1의자리값 구하기
                    answer++;
                    num /= 10;        // 10의자리값 구하기
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        int i = 1;
        int j = 13;
        int k = 1;
        System.out.println(solution(i, j, k));
    }
}
