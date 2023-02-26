package Programmers.lv2;

import java.util.Stack;

public class P09_택배상자 {
    public int solution(int[] wantOrder) {
        int answer = 0;

        Stack<Integer> saveOrder = new Stack<>();

        // 기본 1부터 시작
        int defaultOrder = 1;
        // 택배기사가 원하는 순서
        int wantOrderIdx = 0;

        while (true) {
            // 보조컨테이너에 있는 숫자와 택배기사아 원하는 숫자가 같을때
            if (!saveOrder.isEmpty() && wantOrder[wantOrderIdx] == saveOrder.peek()) {
                answer++;

                wantOrderIdx++;
                saveOrder.pop();

                continue;
            }

            // 상자수 만큼 돌다가 오버값이 나오면 작업멈춤
            if (defaultOrder > wantOrder.length)
                break;

            // 택배기사가 원하는 순서의 값과 기본 순서대로 나오는 상자 값이 같을때
            if (wantOrder[wantOrderIdx] == defaultOrder) {
                answer++;

                wantOrderIdx++;
                defaultOrder++;

                continue;
            }

            saveOrder.push(defaultOrder);
            defaultOrder++;
        }

        return answer;
    }
    public static void main(String[] args) {
        P09_택배상자 q = new P09_택배상자();

        int[] order = {4, 3, 1, 2, 5};
        System.out.println(q.solution(order));
    }
}
