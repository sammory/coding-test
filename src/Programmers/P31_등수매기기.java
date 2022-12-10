package Programmers;

/*
    영어 점수와 수학 점수의 평균 점수를 기준으로 학생들의 등수를 매기려고 합니다.
    영어 점수와 수학 점수를 담은 2차원 정수 배열 score 가 주어질 때,
    영어 점수와 수학 점수의 평균을 기준으로 매긴 등수를 담은 배열을
    return 하도록 solution 함수를 완성해주세요.
 */

import java.util.Arrays;

public class P31_등수매기기 {
    public static int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        Arrays.fill(answer,1); // 초기값 1로 설정

        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score.length; j++) {
                if (score[i][0] + score[i][1] < score[j][0] + score[j][1]) { // 비교값 작을수록 +1
                    answer[i]++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        int[][] score = new int[][]{{80,71}, {90,50}, {40,70},{50,80}};
        System.out.println(solution(score));
    }
}
