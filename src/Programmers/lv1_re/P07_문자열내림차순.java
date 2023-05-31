package Programmers.lv1_re;

import java.util.Arrays;
import java.util.Collections;

/*
    문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
    s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.
 */
public class P07_문자열내림차순 {
    public String solution(String s) {
        String answer = "";
        // 문자열 스플릿기준으로 자르기
        String[] str = s.split("");

        // 문자열 내림차순 정렬
        Arrays.sort(str, Collections.reverseOrder());

        for (String a : str) {
            answer += a;
        }

        return answer;
    }
    public static void main(String[] args) {
        P07_문자열내림차순 q = new P07_문자열내림차순();

        String s = "Zbcdefg";
        System.out.println(q.solution(s));
    }
}
