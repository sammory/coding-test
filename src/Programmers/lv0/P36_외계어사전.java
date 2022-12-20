package Programmers.lv0;

/*
    PROGRAMMERS-962 행성에 불시착한 우주비행사 머쓱이는 외계행성의 언어를 공부하려고 합니다.
    알파벳이 담긴 배열 spell 과 외계어 사전 dic 이 매개변수로 주어집니다.
    spell 에 담긴 알파벳을 한번씩만 모두 사용한 단어가 dic 에 존재한다면 1,
    존재하지 않는다면 2를 return 하도록 solution 함수를 완성해주세요.
 */

public class P36_외계어사전 {
    public static int solution(String[] spell, String[] dic) {
        int answer = 2;

        for(String dicS : dic) {

            boolean isRight = true;
            for(String spellS : spell) {
                if(dicS.indexOf(spellS) == -1) { // indexof 는 해당문자 없으면 -1를 반환함
                    isRight = false;
                    break;
                }
            }

            if(isRight) {
                answer = 1;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        String[] spell = {"z", "d", "x"};
        String[] dic = {"def", "dww", "dzx", "loveaw"};
        System.out.println(solution(spell,dic));
    }
}
