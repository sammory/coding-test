package Programmers.lv1_re;
/*
    행렬의 덧셈은 행과 열의 크기가 같은 두 행렬의 같은 행, 같은 열의 값을 서로 더한 결과가 됩니다.
    2개의 행렬 arr1과 arr2를 입력받아, 행렬 덧셈의 결과를 반환하는 함수, solution을 완성해주세요.
 */
public class P26_행렬의덧셈 {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = {};
        answer = arr1; // arr1을 answer로

        // 반복문으로 arr1에 arr2를 더함
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                answer[i][j] += arr2[i][j];
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        P26_행렬의덧셈 q = new P26_행렬의덧셈();

        int[][] arr1 = {{1,2}, {2,3}};
        int[][] arr2 = {{3,4}, {5,6}};
        System.out.println(q.solution(arr1,arr2));
    }
}
