package Programmers.lv2;
/*
    다음 규칙을 지키는 문자열을 올바른 괄호 문자열이라고 정의합니다.

    (), [], {} 는 모두 올바른 괄호 문자열입니다.
    만약 A가 올바른 괄호 문자열이라면, (A), [A], {A} 도 올바른 괄호 문자열입니다. 예를 들어, [] 가 올바른 괄호 문자열이므로, ([]) 도 올바른 괄호 문자열입니다.
    만약 A, B가 올바른 괄호 문자열이라면, AB 도 올바른 괄호 문자열입니다. 예를 들어, {} 와 ([]) 가 올바른 괄호 문자열이므로, {}([]) 도 올바른 괄호 문자열입니다.
 */
import java.util.Stack;

public class P15_괄호회전하기 {
    public int solution(String s) {
        int answer = 0;
        String str = s;

        for (int i = 0; i < s.length(); i++) {
            if (check(str)) answer++;
            // 문자열 두번째부터 마지막까지 자른 후 첫번째문자를 마지막에 추가.
            str = str.substring(1, s.length()) + str.charAt(0);
        }

        return answer;
    }
    static boolean check(String str) {
        Stack<Character> stack = new Stack<>();
        // 스택에 값을 넣고 짝이 있을경우 pop 으로 값 빼기
        // 반복문이 끝났을때 스택이 비어있으면 true 리턴
        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case '(' :
                    stack.push('(');
                    break;
                case '{' :
                    stack.push('{');
                    break;
                case '[' :
                    stack.push('[');
                    break;
                // 열린 괄호가 없거나 처음부터 닫힌괄호로 시작할 경우 false
                case ')' :
                    if (stack.isEmpty() || stack.peek() != '(') return false;
                    stack.pop();
                    break;
                case '}' :
                    if (stack.isEmpty() || stack.peek() != '{') return false;
                    stack.pop();
                    break;
                case ']' :
                    if (stack.isEmpty() || stack.peek() != '[') return false;
                    stack.pop();
                    break;
            }
        }

        return stack.isEmpty();
    }
    public static void main(String[] args) {
        P15_괄호회전하기 q = new P15_괄호회전하기();

        String s = "({})[]";
        System.out.println(q.solution(s));
    }
}
