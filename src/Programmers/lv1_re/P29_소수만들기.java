package Programmers.lv1_re;
/*
    주어진 숫자 중 3개의 수를 더했을 때 소수가 되는 경우의 개수를 구하려고 합니다.
    숫자들이 들어있는 배열 nums가 매개변수로 주어질 때, nums에 있는 숫자들 중
    서로 다른 3개를 골라 더했을 때 소수가 되는 경우의 개수를 return 하도록 solution 함수를 완성해주세요.
 */
public class P29_소수만들기 {
    public int solution(int[] nums) {
        int answer = 0;
        int sum = 0;

        // 반복문으로 3개의 숫자합을 구함
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    sum = nums[i] + nums[j] + nums[k];
                    // 소수판별 후 카운터
                    if (isPrime(sum)) {
                        answer++;
                    }
                }
            }
        }

        return answer;
    }
    // 소수 판별
    public boolean isPrime(int sum) {
        for (int i = 2; i <= Math.sqrt(sum); i++) {
            if (sum % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        P29_소수만들기 q = new P29_소수만들기();

        int[] nums = {1,2,7,6,4};
        System.out.println(q.solution(nums));
    }
}
