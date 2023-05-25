package Programmers.lv1_re;
/*
단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
*/
public class P01_가운데글자 {
    public String solution(String s) {
        String answer = "";

        //짝수와 홀수인 경우로 나누어서 정리
        if(s.length() % 2 == 0) {
            answer = s.substring(s.length() / 2 - 1, s.length() / 2 + 1);
        } else {
            answer = s.substring(s.length() / 2, s.length() / 2 + 1);
        }
        return answer;
    }

    public static void main(String[] args) {
        P01_가운데글자 q = new P01_가운데글자();

        String s = "abcde";
        System.out.println(q.solution(s));
    }
}
