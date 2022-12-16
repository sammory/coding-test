package Programmers;
/*
    숫자와 "Z"가 공백으로 구분되어 담긴 문자열이 주어집니다.
    문자열에 있는 숫자를 차례대로 더하려고 합니다.
     이 때 "Z"가 나오면 바로 전에 더했던 숫자를 뺀다는 뜻입니다.
     숫자와 "Z"로 이루어진 문자열 s가 주어질 때, 머쓱이가 구한 값을
     return 하도록 solution 함수를 완성해보세요.
 */
public class P43_컨트롤제트 {
    public static int solution(String s) {
        int answer = 0;
        String[] arr = s.split(" ");
        String tmp = "";

        for (int i = 0; i < arr.length; i++) {
            if (!arr[i].equals("Z")) {
                answer += Integer.parseInt(arr[i]);  // Z가 아닐때는 더해줌
            } else {
                answer -= Integer.parseInt(arr[i-1]); // Z 일때는 현재 i번째 전값을 빼줌
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        String s = "1 2 Z 3";
        System.out.println(solution(s));

    }

}
