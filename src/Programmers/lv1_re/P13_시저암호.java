package Programmers.lv1_re;
/*
    어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다.
    예를 들어 "AB"는 1만큼 밀면 "BC"가 되고, 3만큼 밀면 "DE"가 됩니다. "z"는 1만큼 밀면 "a"가 됩니다.
    문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수, solution을 완성해 보세요.
 */
public class P13_시저암호 {
    public String solution(String s, int n) {
        String answer = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ' ') { // 공백일 경우 그대로 추가
                answer += ch;
            }
            // 소문자일 경우
            if (ch >= 'a' && ch <= 'z') { // ch가 소문자일 경우
                if (ch + n > 'z') { // n만큼 밀었을때 가장큰 z보다 클경우
                    answer += (char)(ch - 26 + n);  // ch - 알파벳수 + 밀어낼 수
                } else {
                    answer += (char)(ch + n);  // z를 넘지 않을 경우 그대로 n번만큼 밀어내어 추가
                }
            // 대문자일 경우
            } else if (ch >= 'A' && ch <= 'Z') {
                if (ch + n > 'Z') {
                    answer += (char)(ch - 26 +n);
                } else {
                    answer += (char)(ch + n);
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        P13_시저암호 q = new P13_시저암호();

        String s = "AB";
        int n = 1;
        System.out.println(q.solution(s, n));
    }
}
