package Programmers.lv1_re;
/*
    정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.
 */
public class P24_평균구하기 {
    public double solution(int[] arr) {
        double answer = 0;

        // arr의 모든수를 더해줌
        for (int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }
        // 더한 수를 arr의 길이만큼 나누어 평균값 구함
        answer /= arr.length;

        return answer;
    }
    public static void main(String[] args) {
        P24_평균구하기 q = new P24_평균구하기();

        int[] arr = {1,2,3,4};
        System.out.println(q.solution(arr));
    }
}
