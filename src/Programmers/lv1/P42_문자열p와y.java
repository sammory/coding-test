package Programmers.lv1;
/*
    대문자와 소문자가 섞여있는 문자열 s가 주어집니다. s에 'p'의 개수와 'y'의 개
    수를 비교해 같으면 True, 다르면 False를 return 하는 solution를 완성하세요.
    'p', 'y' 모두 하나도 없는 경우는 항상 True를 리턴합니다. 단, 개수를 비교할 때 대문자와 소문자는 구별하지 않습니다.
 */
public class P42_문자열p와y {
    static boolean solution(String s) {
        boolean answer = true;
        String arr = s.toLowerCase();            // 문자전체를 소문자로 변환
        int p = 0;
        int y = 0;

        for (int i = 0; i < s.length(); i++) {   // 해당 값 나올때마다 카운트
            if (arr.charAt(i) == 'p') {
                p++;
            } else if (arr.charAt(i) == 'y') {
                y++;
            }
        }
        if (p == y) {                            // 카운트 비교
            answer = true;
        } else {
            answer = false;
        }
        return answer;
    }
    public static void main(String[] args) {

        String s = "pPoooyY";
        System.out.println(solution(s));
    }
}
