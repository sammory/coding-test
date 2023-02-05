package Programmers.lv1;

import java.util.ArrayList;
import java.util.Collections;

/*
    문자열로 구성된 리스트 strings와, 정수 n이 주어졌을 때, 각 문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬하려 합니다.
    예를 들어 strings가 ["sun", "bed", "car"]이고 n이 1이면 각 단어의 인덱스 1의 문자 "u", "e", "a"로 strings를 정렬합니다.
 */
public class P44_문자열내맘음 {
    public static String[] solution(String[] strings, int n) {
        String[] answer = {};
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < strings.length; i++) {
            list.add(strings[i].charAt(n) + strings[i]);     // n번째 문자 + i번째 문자열
        }

        // 정렬
        Collections.sort(list);

        answer = new String[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i).substring(1, list.get(i).length());   // 첫번째문자 제외한값 저장
        }

        return answer;
    }
    public static void main(String[] args) {

        String[] strings = {"sun", "bed", "car"};
        int n = 1;
        System.out.println(solution(strings,n));
    }
}
