package Programmers.lv1;
/*
    정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.
 */
public class P36_평균구하기 {
    public static double solution(int[] arr) {
        double answer = 0;

        for (int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }
        answer /= arr.length;

        return answer;
    }
    public static void main(String[] args) {

        int[] arr = {1,2,3,4};
        System.out.println(solution(arr));
    }
}
