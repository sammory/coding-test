package Programmers.lv0;

/*
    정수 n을 기준으로 n과 가까운 수부터 정렬하려고 합니다.
    이때 n으로부터의 거리가 같다면 더 큰 수를 앞에 오도록 배치합니다.
    정수가 담긴 배열 numlist와 정수 n이 주어질 때 numlist 의 원소를 n 으로부터
    가까운 순서대로 정렬한 배열을 return 하도록 solution 함수를 완성해주세요.
 */

import java.util.Arrays;

public class P32_특이한정렬 {
    public static int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        Arrays.sort(numlist);




        return answer;
    }

    public static void main(String[] args) {

        int[] numlist = new int[]{1, 2, 3, 4, 5, 6};
        int n = 4;
        System.out.println(solution(numlist, n));
    }
}
