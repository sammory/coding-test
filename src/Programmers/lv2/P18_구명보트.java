package Programmers.lv2;

import java.util.Arrays;

/*
    사람들의 몸무게가 [70kg, 50kg, 80kg, 50kg]이고 구명보트의 무게 제한이 100kg이라면
    2번째 사람과 4번째 사람은 같이 탈 수 있지만 1번째 사람과 3번째 사람의 무게의 합은 150kg이므로
    구명보트의 무게 제한을 초과하여 같이 탈 수 없습니다.
    구명보트를 최대한 적게 사용하여 모든 사람을 구출하려고 합니다.
 */
public class P18_구명보트 {
    public int solution(int[] people, int limit) {
        int answer = 0;
        // people 의 첫번째인덱스
        int index = 0;

        Arrays.sort(people);
        // index 와 같아질때 까지 맨뒤의 인덱스를 감소시키면서 반복문 진행
        for (int max = people.length - 1; index <= max; max--) {
            if (people[index] + people[max] <= limit) {
                index++;
                answer++;
            } else {
                answer++;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        P18_구명보트 q = new P18_구명보트();

        int[] people = {70, 50, 80, 50};
        int limit = 100;
        System.out.println(q.solution(people,limit));
    }
}
