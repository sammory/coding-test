package Programmers;
/*
    문자열 my_string이 매개변수로 주어집니다.
    my_string안의 모든 자연수들의 합을 return하도록 solution 함수를 완성해주세요.
 */
public class P45_숨어있는숫자덧셈2 {
    public static int solution(String my_string) {
        int answer = 0;

        String[] arr = my_string.replaceAll("[a-zA-Z]", " ").split("");

        for (int i = 0; i < arr.length; i++) {
            if (!arr[i].equals(" ")) {
                answer += Integer.parseInt(arr[i]);
            }
        }
        System.out.println(arr);
        return answer;
    }

    public static void main(String[] args) {

        String my_string = "aAb1B2cC34oOp";
        System.out.println(solution(my_string));
    }
}
