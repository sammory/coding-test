package Programmers.lv1_re;

import java.util.Locale;

/*
    대문자와 소문자가 섞여있는 문자열 s가 주어집니다. s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True, 다르면 False를 return 하는 solution를 완성하세요.
     'p', 'y' 모두 하나도 없는 경우는 항상 True를 리턴합니다. 단, 개수를 비교할 때 대문자와 소문자는 구별하지 않습니다.
 */
public class P06_문자열개수 {
    boolean solution(String s) {
        boolean answer = true;
        // s 문자를 모두 대문자로 변경
        String arr = s.toUpperCase();
        int p = 0;
        int y = 0;

        // p와 y를 찾을때 마다 수량체크
        for (int i = 0; i < s.length(); i++) {
            if (arr.charAt(i) == 'P') {
                p++;
            } else if (arr.charAt(i) == 'Y') {
                y++;
            }
        }

        // 값 비교 후 리턴
        if (p == y) {
            answer = true;
        } else {
            answer = false;
        }

        return answer;
    }
    public static void main(String[] args) {
        P06_문자열개수 q = new P06_문자열개수();

        String s = "pPoooyY";
        System.out.println(q.solution(s));
    }
}
