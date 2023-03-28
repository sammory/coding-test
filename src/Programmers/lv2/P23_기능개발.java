package Programmers.lv2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class P23_기능개발 {
    public int[] solution(int[] progresses, int[] speeds) {

        Queue<Integer> que = new LinkedList<>();
        List<Integer> list = new ArrayList<>();

        // 큐에 각각의 남은 작업기간을 넣는다
        for (int i = 0; i < progresses.length; i++) {
            int work = 100 - progresses[i];

            // 남은 작업진도가 개발 속도로 나누어 떨어진다면 나눈 몫만큼이 개발 기간이 되고
            // 나머지가 남는다면 다음날 까지 작업을 해야 기능이 완성되므로 나눈 몫에서 1을 더한 값이 개발 기간이 된다
            if (work % speeds[i] == 0) {
                que.add(work / speeds[i]);
            } else {
                que.add(work / speeds[i] + 1);
            }
        }
        int cnt = 1;
        int day = que.poll(); // 첫번째를 꺼내서 그다음 큐에 있는 내용과 비교하기위해
        // 큐에 내용이 없을때 까지 반복
        while (!que.isEmpty()) {
            // 첫번째 날짜와 그다음 날짜의 완료 기간을 비교
            if (day >= que.peek()) {
                cnt++;
                que.poll();
            } else {
                // 큐에서 꺼낸 날짜보다 오래걸릴 때
                list.add(cnt); // 현재 배포가능한 수량 저장
                cnt = 1; // cnt 초기화
                day = que.poll(); // day 업데이트
            }
        }
        list.add(cnt);

        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }


        return answer;
    }
    public static void main(String[] args) {
        P23_기능개발 q = new P23_기능개발();

        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};
        System.out.println(q.solution(progresses,speeds));
    }
}
