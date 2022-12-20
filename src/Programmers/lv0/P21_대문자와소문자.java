package Programmers.lv0;

// 대문자와 소문자

public class P21_대문자와소문자 {
    public static String solution(String my_string) {
        String answer = "";
        String[] arr = my_string.split("");

        for (int i = 0; i < my_string.length(); i++) {
            if (my_string.charAt(i) >= 97) {
                answer += arr[i].toUpperCase();
            } else {
                answer += arr[i].toLowerCase();
            }
        }


        return answer;
    }

    public static void main(String[] args) {

        String numbers = "abCdEfghIJ";
        System.out.println(solution(numbers));
    }

}
