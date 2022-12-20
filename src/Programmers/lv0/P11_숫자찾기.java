package Programmers.lv0;

import java.util.Stack;

//숫자 찾기 11/10

public class P11_숫자찾기 {

    public static int solution(int num, int k) {
        int answer = 0;

        Stack<Integer> stack = new Stack();
        while (num > 0) {
            stack.add(num % 10);
            num /= 10;

        }

        if (!stack.contains(k)) {
            answer = -1;
        } else {
            while (!stack.isEmpty()) {
                answer++;
                if (stack.pop() == k)
                    break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        int num = 29183;
        int k = 1;

        System.out.println(solution(num, k));

    }
}