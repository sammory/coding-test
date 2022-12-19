package Programmers;

import java.util.Arrays;

public class P48_최대값만들기2 {
    public static int solution(int[] numbers) {
        int answer = 0;

        Arrays.sort(numbers);
        answer = numbers[numbers.length-2] * numbers[numbers.length-1];
        return answer;
    }
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(solution(numbers));
    }
}
