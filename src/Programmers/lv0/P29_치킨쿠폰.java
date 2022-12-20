package Programmers.lv0;

/* 치킨쿠폰
        프로그래머스 치킨은 치킨을 시켜먹으면 한 마리당 쿠폰을 한 장 발급합니다.
        쿠폰을 열 장 모으면 치킨을 한 마리 서비스로 받을 수 있고, 서비스 치킨에도 쿠폰이 발급됩니다.
        시켜먹은 치킨의 수 chicken 이 매개변수로 주어질 때 받을 수 있는
        최대 서비스 치킨의 수를 return 하도록 solution 함수를 완성해주세요.
*/
public class P29_치킨쿠폰 {
    public static int solution(int chicken) {
        int answer = 0;

        while (chicken >= 10) {
            int coupon1 = chicken / 10; // 10
            int coupon2 = chicken % 10; // 8

            chicken = coupon1 + coupon2;
            answer += coupon1;
        }

        return answer;
    }

    public static void main(String[] args) {

        int chicken = 108;
        System.out.println(solution(chicken));
    }
}
