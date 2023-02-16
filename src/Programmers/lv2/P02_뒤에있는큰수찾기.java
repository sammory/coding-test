package Programmers.lv2;

import java.util.Stack;
/*
    정수로 이루어진 배열 numbers가 있습니다. 배열 의 각 원소들에 대해 자신보다 뒤에 있는 숫자 중에서 자신보다 크면서 가장 가까이 있는 수를 뒷 큰수라고 합니다.
    정수 배열 numbers가 매개변수로 주어질 때, 모든 원소에 대한 뒷 큰수들을 차례로 담은 배열을 return 하도록 solution 함수를 완성해주세요. 단, 뒷 큰수가 존재하지 않는 원소는 -1을 담습니다.
 */
public class P02_뒤에있는큰수찾기 {
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
