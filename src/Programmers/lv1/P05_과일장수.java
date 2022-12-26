package Programmers.lv1;

import java.util.Arrays;
/*
과일 장수가 가능한 많은 사과를 팔았을 때, 얻을 수 있는 최대 이익을 계산하고자 합니다.
(사과는 상자 단위로만 판매하며, 남는 사과는 버립니다)
예를 들어, k = 3, m = 4, 사과 7개의 점수가 [1, 2, 3, 1, 2, 3, 1]이라면,
다음과 같이 [2, 3, 2, 3]으로 구성된 사과 상자 1개를 만들어 판매하여 최대 이익을 얻을 수 있습니다.
 */
public class P05_과일장수 {
  public static int solution(int k, int m, int[] score) {
    int answer = 0;
    Arrays.sort(score);

    for (int i = score.length; i >= m; i -= m) {  // 뒤에서 부터 m번재 만큼씩 돌면서 값 구함
      answer += score[i-m] * m;                   // 구합 값 자릿수에서 m을 곱하여 추가
    }

    return answer;
  }

  public static void main(String[] args) {

    int k = 4;
    int m = 3;
    int[] score = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};
    System.out.println(solution(k,m,score));
  }

}
