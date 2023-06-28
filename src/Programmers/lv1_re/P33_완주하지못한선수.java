package Programmers.lv1_re;

import java.util.HashMap;

/*
    마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때,
    완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.
 */
public class P33_완주하지못한선수 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hm = new HashMap<>();

        // 키 설정 후 값에 키와 값을 한번더 저장, 동일 키일 경우 기존값에 1을 더해줌
        for (String player : participant) {
            hm.put(player, hm.getOrDefault(player, 0) + 1);
        }
        // 키 설정 후 값에 키와 값을 한번더 저장, 동일 키일 경우 기존값에 1을 빼줌
        for (String player : completion) {
            hm.put(player, hm.getOrDefault(player, 0) - 1);
        }
        // 값이 0이 아닌경우 완주하지 못한것이
        for (String key : hm.keySet()) {
            if (hm.get(key) != 0) {
                answer = key;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        P33_완주하지못한선수 q = new P33_완주하지못한선수();

        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};
        System.out.println(q.solution(participant, completion));
    }
}
