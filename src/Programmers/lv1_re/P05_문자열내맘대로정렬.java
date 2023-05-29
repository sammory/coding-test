package Programmers.lv1_re;

import java.util.ArrayList;
import java.util.Collections;
/*
    문자열로 구성된 리스트 strings와, 정수 n이 주어졌을 때, 각 문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬하려 합니다.
    예를 들어 strings가 ["sun", "bed", "car"]이고 n이 1이면 각 단어의 인덱스 1의 문자 "u", "e", "a"로 strings를 정렬합니다.
 */
public class P05_문자열내맘대로정렬 {
    public String[] solution(String[] strings, int n) {
        String[] answer = {};
        ArrayList<String> list = new ArrayList<>();

        // 반복문으로 strings 각각의 맨앞에 n번째 문자를 추가하여 list에 저장 ex) sun = usun
        for (int i = 0; i < strings.length; i++) {
            list.add(strings[i].charAt(n) + strings[i]);
        }

        // 오른차순으로 정렬
        Collections.sort(list);

        answer = new String[list.size()];

        // 맨앞의 문자 제외한 나머지를 answer에 저장
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i).substring(1, list.get(i).length());
        }

        return answer;
    }
    public static void main(String[] args) {
        P05_문자열내맘대로정렬 q = new P05_문자열내맘대로정렬();

        String[] strings = {"sun", "bed", "car"};
        int n = 1;
        System.out.println(q.solution(strings,n));
    }
}
