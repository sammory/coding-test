package Programmers.lv1;

import java.util.HashSet;

public class P38_폰켓몬 {
    public static int solution(int[] nums) {
        int answer = 0;
        HashSet<Integer> hs = new HashSet<>();
        int max = nums.length / 2;

        for (int i = 0; i < nums.length; i++) {
            hs.add(nums[i]);
        }
        if (hs.size() > max) {
            answer = max;
        } else {
            answer = hs.size();
        }

        return answer;
    }
    public static void main(String[] args) {

        int[] nums = {3,1,2,3};
        System.out.println(solution(nums));
    }
}
