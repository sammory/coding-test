package Programmers.lv1;
/*
문자열 s는 한 개 이상의 단어로 구성되어 있습니다.
각 단어는 하나 이상의 공백문자로 구분되어 있습니다.
각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.
 */
public class P40_이상한문자 {
    public static String solution(String s) {
        String answer = "";
        int idx = 0;

        String[] strArr = s.split("");

        for(int i = 0; i < strArr.length; i++) {
            if((" ").equals(strArr[i]))
                idx = 0;
            else {
                if(idx % 2 == 0) {
                    idx++;
                    strArr[i] = strArr[i].toUpperCase();
                }else {
                    idx++;
                    strArr[i] = strArr[i].toLowerCase();
                }
            }
            answer += strArr[i];
        }

        return answer;
    }
    public static void main(String[] args) {

        String s = "        ABC abc ABC       ";
        System.out.println(solution(s));
    }
}
