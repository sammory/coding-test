package Programmers.lv2;

import java.util.Stack;

public class P02_숫자변환하기 {
    public static int[] solution(int[] numbers) {
        // 인덱스를 스택으로 관리
        // 뒷수가 앞수보다 클때는 answer에 값을 넣고 스택에는 제거, 반대 경우일때는 스택에 기록되있는 인덱스로 값 처리
        Stack<Integer> stack = new Stack<>();
        int[] answer = new int[numbers.length];

        for(int i = 0 ; i < numbers.length ; i++) {
            // 스택길이가 0이거나 인덱스 i 뒷수가 앞수보다 작을때
            if(stack.isEmpty() || numbers[i] < numbers[i - 1]) {
                stack.push(i);
            } else {
                // 스택길이가 0이 아닐때 && 스택Top 인덱스값(앞수)과 numbers[i]번째값(뒷수) 비교
                while(!stack.isEmpty() && numbers[stack.peek()] < numbers[i]) {
                    answer[stack.pop()] = numbers[i];
                }
                stack.push(i);
            }
        }
        // 나머지는 -1
        while(!stack.isEmpty()) {
            answer[stack.pop()] = -1;
        }
        return answer;
    }

    public static void main(String[] arg) {

        int[] numbers = {2, 3, 3, 5};
        System.out.println(solution(numbers));
    }
}
