package Programmers;

import java.util.Arrays;

/*
    정수 배열 numbers 가 매개변수로 주어집니다. 
    numbers 의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 
    return 하도록 solution 함수를 완성해주세요.
 */
public class P39_최대값만들기 {
    public static int solution(int[] numbers) {
        int answer = 0;

        Arrays.sort(numbers); // 크기별로 정렬
        int num1 = numbers[numbers.length-1] * numbers[numbers.length-2]; // 가장큰수 두자리 곱
        int num2 = numbers[0] * numbers[1]; // 가장작은수 두자리 곱

        if (num1 > num2) { // 두수의 값 비교하여 반환
            answer = num1;
        } else {
            answer = num2;
        }
        return answer;
    }

    public static void main(String[] args) {

        int[] numbers = {1, 2, -3, 4, -5};
        System.out.println(solution(numbers));
    }
}
