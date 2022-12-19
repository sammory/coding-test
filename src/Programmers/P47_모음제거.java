package Programmers;
/*  12/19
    영어에선 a, e, i, o, u 다섯 가지 알파벳을 모음으로 분류합니다.
    문자열 my_string 이 매개변수로 주어질 때 모음을 제거한 문자열을
    return 하도록 solution 함수를 완성해주세요.
 */
public class P47_모음제거 {
    public static String solution(String my_string) {
        String answer = "";

        String arr = my_string.replaceAll("[a,e,i,o,u]",""); // 모음만 ""로 변환
        answer = arr;

        return answer;
    }

    public static void main(String[] args) {

        String my_string = "nice to meet you";
        System.out.println(solution(my_string));
    }
}
