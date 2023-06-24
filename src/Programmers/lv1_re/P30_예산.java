package Programmers.lv1_re;
/*
    S사에서는 각 부서에 필요한 물품을 지원해 주기 위해 부서별로 물품을 구매하는데 필요한 금액을 조사했습니다.
    그러나, 전체 예산이 정해져 있기 때문에 모든 부서의 물품을 구매해 줄 수는 없습니다.
    그래서 최대한 많은 부서의 물품을 구매해 줄 수 있도록 하려고 합니다.
 */
import java.util.Arrays;

public class P30_예산 {
    public int solution(int[] d, int budget) {
        int cnt = 0; // 지원 가능한 부서 수
        Arrays.sort(d); // 오름차순 정렬

        for (int i = 0; i < d.length; i++) {
            if (budget >= d[i]) { // 예산이 신청 금액보다 크거나 같으면 해당 부서를 지원
                budget -= d[i]; // 지원한 금액만큼 예산에서 차감
                cnt++; // 부서 수 증가
            } else {
                break; // 예산을 초과하는 경우 지원 종료
            }
        }

        return cnt;
    }
    public static void main(String[] args) {
        P30_예산 q = new P30_예산();

        int[] d = {1,2,7,6,4};
        int budget = 9;
        System.out.println(q.solution(d, budget));
    }
}
