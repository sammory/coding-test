package Pro;

import java.util.Arrays;

//문자열 졍렬하기2

public class P04_문자열정렬 {

    public static String solution(String my_string) {
        String answer = my_string.toLowerCase();
        char[] charArr = answer.toCharArray();
        Arrays.sort(charArr);
        answer = new String(charArr);
        return answer;
    }



    public static void main(String[] args) {

        String my_string = "eCbDa";

        System.out.println(solution(my_string));

    }
}
