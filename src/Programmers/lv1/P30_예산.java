package Programmers.lv1;

import java.util.Arrays;

/*
    부서별로 신청한 금액이 들어있는 배열 d와 예산 budget이 매개변수로 주어질 때,
    최대 몇 개의 부서에 물품을 지원할 수 있는지 return 하도록 solution 함수를 완성해주세요.
 */
public class P30_예산 {
    public static int solution(int[] d, int budget) {
        int answer = 0;
        int cnt = 0;

        Arrays.sort(d);                            // 오른차순으로 정렬
        for (int i = 0; i < d.length; i++) {
            cnt += d[i];                           // budget 보다 작거나 같을때까지 더하고 cnt 추가
            if (cnt <= budget) {
                answer++;
            } else {                               // budget 보다 클 경우 작업중지
                break;
            }
        }

        return answer;
    }
    public static void main(String[] args) {

        int[] d = {1,3,2,5,4};
        int budget = 9;
        System.out.println(solution(d,budget));
    }
}
