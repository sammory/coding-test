package Programmers.lv2;
/*
    스파이가 가진 옷이 아래와 같고 오늘 스파이가 동그란 안경, 긴 코트, 파란색 티셔츠를 입었다면
     다음날은 청바지를 추가로 입거나 동그란 안경 대신 검정 선글라스를 착용하거나 해야 합니다.
     스파이가 가진 의상들이 담긴 2차원 배열 clothes가 주어질 때 서로 다른 옷의 조합의 수를 return 하도록 solution 함수를 작성해주세요.
 */
import java.util.HashMap;

public class P26_위장 {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> map = new HashMap<>();

        // 각 의상의 종류별로 개수를 카운트
        for (int i = 0; i < clothes.length; i++) {
            String type = clothes[i][1];
            map.put(type, map.getOrDefault(type, 1) + 1);
        }
        // 각 종류별 의상의 개수를 곱해서 모든 조합의 경우의 수를 계산
        for (String key : map.keySet()) {
            answer *= map.get(key);
        }
        // 아무것도 입지 않는 경우를 제외하기 위해 1을 빼줌
        answer -= 1;

        return answer;
    }
    public static void main(String[] args) {
        P26_위장 q = new P26_위장();

        String[][] clothes = {{"yellow_hat", "headgear"},{"blue_sunglasses", "eyewear"},{"green_turban", "headgear"}};
        System.out.println(q.solution(clothes));
    }
}
