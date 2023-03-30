package Programmers.lv2;

import java.util.Stack;

public class P24_주식가격 {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < prices.length; i++) {
            // 스택이 비어있지 않고 현재 주식가격보다 이전 주식가격이 더 높으면
            while (!stack.empty() && prices[stack.peek()] > prices[i]) {
                int top = stack.pop(); // 스택에서 가장 위의 요소를 꺼냄
                answer[top] = i - top; // 이전 주식가격의 기간을 계산하여 정답 배열에 저장
            }
            stack.push(i); // 현재 주식가격의 인덱스를 스택에 저장
        }
        // 스택에 남아있는 주식가격의 기간을 계산하여 정답 배열에 저장
        while (!stack.isEmpty()) {
            int top = stack.pop();
            answer[top] = prices.length - top - 1;
        }

        return answer;
    }
    public static void main(String[] args) {
        P24_주식가격 q = new P24_주식가격();

        int[] prices = {1, 2, 3, 2, 3};
        System.out.println(q.solution(prices));
    }
}
