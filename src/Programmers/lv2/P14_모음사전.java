package Programmers.lv2;

public class P14_모음사전 {
    public int solution(String word) {
        String str = "AEIOU";
        // 각 자리수가 변경될때마다 증가하는 값. (규칙)
        int[] x = {781,156,31,6,1};
        int index,result = word.length();
        for(int i = 0; i < word.length();i++){
            index = str.indexOf(word.charAt(i));
            result += x[i] * index;
        }
        return result;
    }
    public static void main(String[] args) {
        P14_모음사전 q = new P14_모음사전();

        String word = "AAAAE";
        System.out.println(q.solution(word));
    }
}
