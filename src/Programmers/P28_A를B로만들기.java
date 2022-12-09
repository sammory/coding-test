package Programmers;

// A를 B로 만들기 12/9

import java.util.Arrays;

public class P28_A를B로만들기 {
    public static int solution(String before, String after) {
        int answer = 0;
        char[] arr1 = before.toCharArray(); // 문자를 배열로 변경
        char[] arr2 = after.toCharArray();

        Arrays.sort(arr1); // 순서대로 정렬
        Arrays.sort(arr2);
        String be = new String(arr1); // 문자배열을 문자열로 변경
        String af = new String(arr2);

        if (be.equals(af)) { // 문자 비교 equals
            answer = 1;
        } else {
            answer = 0;
        }

        return answer;
    }


    public static void main(String[] args) {

        String before = "olleh";
        String after = "hello";

        System.out.println(solution(before, after));
    }
}
