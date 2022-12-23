package Programmers.lv1;
/*
기사단원의 수를 나타내는 정수 number와 이웃나라와 협약으로 정해진
공격력의 제한수치를 나타내는 정수 limit와 제한수치를 초과한 기사가
사용할 무기의 공격력을 나타내는 정수 power가 주어졌을 때, 무기점의 주인이
무기를 모두 만들기 위해 필요한 철의 무게를 return 하는 solution 함수를 완성하시오.
*/
public class P04_기사단원의무기 {
    public static int solution(int number, int limit, int power) {
        int answer = 0;

        for (int i = 1; i <= number; i++) {
            int cnt = 0;
            for (int j = 1; j*j <= i; j++) {
                if (j*j == i) {
                    cnt++;
                } else if (i % j == 0) {
                    cnt += 2;
                }
            }
            answer += cnt > limit ? power : cnt;
        }

        return answer;
    }
    public static void main(String[] args) {

        int number = 5;
        int limit = 3;
        int power = 2;
        System.out.println(solution(number,limit,power));
    }
}
