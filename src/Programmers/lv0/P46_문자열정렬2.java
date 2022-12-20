package Programmers.lv0;

import java.util.Arrays;

/*
    문자열 my_string이 매개변수로 주어질 때, my_string 안에 있는
    숫자만 골라 오름차순 정렬한 리스트를 return 하도록 solution 함수를 작성해보세요.
 */
public class P46_문자열정렬2 {
    public static int[] solution(String my_string) {

        String[] arr = my_string.replaceAll("[a-zA-Z]", "").split(""); // 각각 배열에 위치
        Arrays.sort(arr);
        int[] answer = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            answer[i] = Integer.parseInt(arr[i]);
        }

        return answer;
    }

    public static void main(String[] args) {

        String my_string = "hi12392";
        System.out.println(solution(my_string));
    }
}
