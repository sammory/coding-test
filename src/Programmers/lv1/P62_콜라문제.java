package Programmers.lv1;
/*
    콜라를 받기 위해 마트에 주어야 하는 병 수 a, 빈 병 a개를 가져다 주면 마트가 주는 콜라 병 수 b,
    상빈이가 가지고 있는 빈 병의 개수 n이 매개변수로 주어집니다. 상빈이가 받을 수 있는 콜라의 병 수를 return 하도록 solution 함수를 작성해주세요.
 */
public class P62_콜라문제 {
    public int cola(int a, int b, int n) {
        int recycle = 0;

        while (n >= a) { // 빈병이 a개 미만이면 콜라를 받을 수 없음
            int newCola = n / a * b; // 가지고있는 빈병으로 만들수있는 최대 콜라 개수
            recycle += newCola; // 새로받은 콜라병 수를 더함
            n = n % a + newCola; // 남은 빈병 개수 계산
        }

        return recycle;
    }
    public static void main(String[] args) {
        P62_콜라문제 q = new P62_콜라문제();

        int a = 2;
        int b = 1;
        int n = 20;
        System.out.println(q.cola(a,b,n));
    }
}
