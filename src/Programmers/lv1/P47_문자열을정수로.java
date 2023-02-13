package Programmers.lv1;
/*
    문자열 s를 숫자로 변환한 결과를 반환하는 함수, solution을 완성하세요.
 */
public class P47_문자열을정수로 {
    public static int solution(String s) {
        // Integer.parseInt(); 를 사용 하면 함수로 끝낼 수 있음.

        boolean Sign = true;
        int answer = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '-')
                Sign = false;
            else if(ch !='+')
                answer = answer * 10 + (ch - '0');
        }
        return Sign ? 1 : -1 * answer;
    }
    public static void main(String[] args) {

        String s = "1234";
        System.out.println(solution(s));
    }
}
