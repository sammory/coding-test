package Programmers.lv1_re;
/*
    문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요.
    예를 들어 s가 "a234"이면 False를 리턴하고 "1234"라면 True를 리턴하면 됩니다.
 */
public class P08_문자열다루기 {
    public boolean solution(String s) {
        boolean answer = true;
        // 문자열 길이가 4가 아니고 6도 아닌경우
        if (s.length() != 4 && s.length() != 6) {
            return false;
        }
        // 9보다 큰수일 경우
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) > '9') {
                return false;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        P08_문자열다루기 q = new P08_문자열다루기();

        String s = "1234";
        System.out.println(q.solution(s));
    }
}
