package Programmers.lv2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
    원형 수열의 모든 원소 elements가 순서대로 주어질 때,
    원형 수열의 연속 부분 수열 합으로 만들 수 있는 수의 개수를 return 하도록 solution 함수를 완성해주세요.
 */
public class P04_연속부분수열합의개수 {
    public static int solution(int[] elements) {

        int[] newElements = new int[elements.length * 2];

        for(int i = 0; i < elements.length; i++) {
            newElements[i] = newElements[i + elements.length] = elements[i]; // elements 의 배열 값을 두번 넣기 위함
        }

        Set<Integer> set = new HashSet<>();  // 중복된 값 제외하기 위해 set 사용

        // newElements 배열 j부터 j+1 전까지 더하여 set에 추가 -> i 반복 끝나면 i는 증가하면서 두개씩 더함, 3개씩 더함, 4개씩 더함(더하는 길이증가)
        for(int i = 1; i <= elements.length; i++) {
            for(int j = 0; j < elements.length; j++) {
                set.add(Arrays.stream(newElements, j, j+i).sum());
            }
        }

        return set.size();
    }
    public static void main(String[] arg) {

        int[] elements = {7,9,1,1,4};
        System.out.println(solution(elements));
    }
}
