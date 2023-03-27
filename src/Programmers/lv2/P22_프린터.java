package Programmers.lv2;
/*
    현재 대기목록에 있는 문서의 중요도가 순서대로 담긴 배열 priorities와 내가 인쇄를 요청한 문서가 현
    재 대기목록의 어떤 위치에 있는지를 알려주는 location이 매개변수로 주어질 때,
    내가 인쇄를 요청한 문서가 몇 번째로 인쇄되는지 return 하도록 solution 함수를 작성해주세요.
 */
import java.util.Collections;
import java.util.PriorityQueue;

public class P22_프린터 {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        // 우선순위 높은숫자 순
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        // 우선순위 큐에 배열값 넣기
        for (int priority : priorities) {
            pq.add(priority);
        }

        // 큐에 값이 없어질때까지
        while (!pq.isEmpty()) {
            for (int i = 0; i < priorities.length; i++) {
                // 값만 일치하는 경우 해당 문서 출력
                if (pq.peek() == priorities[i]) {
                    pq.poll();
                    answer++;
                    // 값과 위치가 모두 같다면 answer 리턴
                    if (i == location) return answer;
                }
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        P22_프린터 q = new P22_프린터();

        int[] priorities = {1, 1, 9, 1, 1, 1};
        int location = 0;
        System.out.println(q.solution(priorities, location));
    }
}
