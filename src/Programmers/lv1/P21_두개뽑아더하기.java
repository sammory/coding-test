package Programmers.lv1;

import java.util.HashSet;

public class P21_두개뽑아더하기 {
    public static int[] solution(int[] numbers) {

        HashSet<Integer> arr = new HashSet<>();  // 중복제거를 위해 HashSet 사용

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                arr.add(numbers[i]+numbers[j]);
                }
            }

        return arr.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
    public static void main(String[] args) {

        int[] numbers = {2,1,3,4,1};
        System.out.println(solution(numbers));
    }
}
