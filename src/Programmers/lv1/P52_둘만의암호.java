package Programmers.lv1;
/*
    두 문자열 s와 skip, 그리고 자연수 index가 주어질 때, 다음 규칙에 따라 문자열을 만들려 합니다. 암호의 규칙은 다음과 같습니다.

    문자열 s의 각 알파벳을 index만큼 뒤의 알파벳으로 바꿔줍니다.
    index만큼의 뒤의 알파벳이 z를 넘어갈 경우 다시 a로 돌아갑니다.
    skip에 있는 알파벳은 제외하고 건너뜁니다.
 */
import java.util.HashSet;
import java.util.Set;

public class P52_둘만의암호 {
    public String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();

        Set<Character> set = new HashSet<>();
        // skip 의 문자열을 하나씩 char 타입으로 변환하면서 set 에 추가, 비교를 위해만듦
        for (Character c : skip.toCharArray()) {
            set.add(c);
        }

        StringBuilder sb = new StringBuilder();
        // set 에 포함되어있는 값 제외하고 추가
        for (char i = 'a'; i <= 'z'; i++) {
            if (!set.contains(i)) {
                sb.append(i);
            }
        }

        String checkString = sb.toString().repeat(3);
        // z 를 넘었을때를 대비하여 여유있게 동일한 set 으로 복사해둠
        for (int i = 0; i < s.length(); i++) {
            char curChar = s.charAt(i);

            answer.append(checkString.charAt(checkString.indexOf(curChar) + index));
        }


        return answer.toString();
    }
    public static void main(String[] args) {
        P52_둘만의암호 q = new P52_둘만의암호();

        String s = "aukks";
        String skip = "wbqd";
        int index = 5;
        System.out.println(q.solution(s,skip,index));
    }
}
