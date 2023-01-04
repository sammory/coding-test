package Programmers.lv1;
/*
    0부터 9까지의 숫자 중 일부가 들어있는 정수 배열 numbers 가
    매개변수로 주어집니다. numbers 에서 찾을 수 없는 0부터 9까지의
    숫자를 모두 찾아 더한 수를 return 하도록 solution 함수를 완성해주세요.
 */
public class P12_없는숫자더하기 {
    public static int solution(int[] numbers) {
        int answer = 45;          // 0~9까지의 합

        for (int s : numbers) {   // 전체합에서 for 문으로 하나씩 빼줌
            answer -= s;
        }
        return answer;
    }

    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,6,7,8,0};
        System.out.println(solution(numbers));
    }
}
