package Programmers.lv1;

public class P13_부족한금액계산 {
    public static long solution(int price, int money, int count) {
        long answer = 0;
        long need = 0;

        for (int i = 1; i <= count ; i++) {  // count 만큼 가격을 더함
            need += price * i;
        }

        if (need > money) {                  // money 가 부족할 경우일 때, 얼마 부족한지 return
            answer = need - money;
        }

        return answer;
    }

    public static void main(String[] args) {

        int price = 3;
        int money = 20;
        int count = 4;
        System.out.println(solution(price, money, count));
    }
}
