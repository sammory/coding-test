package Programmers;
/*
    문자열 my_string이 매개변수로 주어집니다.
    my_string은 소문자, 대문자, 자연수로만 구성되어있습니다.
    my_string안의 자연수들의 합을 return하도록 solution 함수를 완성해주세요.
 */

public class P38_숨어있는숫자덧셈 {
    public static int solution(String my_string) {
        int answer = 0;

        String[] arr = my_string.replaceAll("[a-zA-Z]"," ").split(" ");
        System.out.println(arr);
        for (int i = 0; i < arr.length; i++) {
            if (!arr[i].equals("")) {
                answer += Integer.parseInt(arr[i]);
            } else {
                continue;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        String my_string = "aAb1B2cC34oOp";
        System.out.println(solution(my_string));
    }
}
