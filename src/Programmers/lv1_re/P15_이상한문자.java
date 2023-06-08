package Programmers.lv1_re;
/*
    문자열 s는 한 개 이상의 단어로 구성되어 있습니다. 각 단어는 하나 이상의 공백문자로 구분되어 있습니다.
    각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.
*/
public class P15_이상한문자 {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String[] arr = s.split(" "); // 문자열을 공백기준으로 나누어 배열에 저장

        for (String str : arr) {
            StringBuilder sb = new StringBuilder();
            // 각각 저장된 문자열 길이만큼 반복
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (i % 2 == 0) {
                    sb.append(Character.toUpperCase(c)); // 대문자일 경우
                } else {
                    sb.append(Character.toLowerCase(c)); // 소문자일 경우
                }
            }
            answer.append(sb).append(" "); // 대소문자바뀐 알파벳과 공백을 같이 저장
        }

        return answer.toString().trim(); // 양쪽 끝의 공백을 제거
    }
    public static void main(String[] args) {
        P15_이상한문자 q = new P15_이상한문자();

        String s = "tryhello world";
        System.out.println(q.solution(s));
    }
}
