package Programmers.lv2;

import java.util.HashMap;
import java.util.Map;
/*
    정현이가 원하는 제품을 나타내는 문자열 배열 want와 정현이가 원하는 제품의 수량을 나타내는 정수 배열 number,
    XYZ 마트에서 할인하는 제품을 나타내는 문자열 배열 discount가 주어졌을 때, 회원등록시 정현이가 원하는 제품을
    모두 할인 받을 수 있는 회원등록 날짜의 총 일수를 return 하는 solution 함수를 완성하시오. 가능한 날이 없으면 0을 return 합니다.
 */
public class P05_할인행사 {
    public static int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        int userDate = 10;

        // 상품을 key 와 value 값에 저장
        Map<String, Integer> wantMap = new HashMap<>();
        int wantLength = want.length;
        for (int i = 0; i < wantLength; i++) {
            wantMap.put(want[i], number[i]);
        }

        // 10일 동안의 할인상품을 key 와 value 값에 저장
        int discountLength = discount.length;
        for (int i = 0; i <= discountLength - userDate; i++) {
            Map<String, Integer> discountMap = new HashMap<>();
            for (int j = 0; j < userDate; j++) {
                String addItem = discount[j + i];
                discountMap.put(addItem, discountMap.getOrDefault(addItem, 0) + 1);
            }

            // key 와 value 값 비교
            boolean isSignup = true;
            for (String wantItem : wantMap.keySet()) {
                int wantCount = wantMap.get(wantItem);
                int discountCount = discountMap.getOrDefault(wantItem, 0);
                if (wantCount > discountCount) {
                    isSignup = false;
                    break;
                }
            }

            if (isSignup) {
                answer++;
            }

        }
        return answer;
    }

    public static void main(String[] arg) {

        String[] want = {"banana", "apple", "rice", "pork", "pot"};
        int[] number = {3, 2, 2, 2, 1};
        String[] discount = {"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"};
        System.out.println(solution(want,number,discount));
    }
}
