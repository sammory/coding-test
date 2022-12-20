package Programmers.lv0;

public class P18_한번만등장한문자 {
    public static String solution(String s) {
        String answer = "";

        int[] alphaAry = new int[26];

        for(int i=0; i<s.length(); i++){
            alphaAry[s.charAt(i)-'a']++;
        }

        for(int i=0; i<alphaAry.length; i++){
            if(alphaAry[i]==1) answer+=(char)(i+'a');
        }

        return answer;
    }

    public static void main(String[] args) {

        String s = "abcabcadc";
        System.out.println(solution(s));
    }
}
