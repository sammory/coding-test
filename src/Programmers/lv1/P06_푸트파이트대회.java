package Programmers.lv1;

public class P06_푸트파이트대회 {
  public static String solution(int[] food) {
    String answer = "";

    for (int i = 1; i < food.length; i++) {
      for (int j = 0; j < food[i]/2; j++) {  // 음식을 2로 나누어 반복횟수를 구하여 더해줌
          answer += i;
      }
    }
    answer += 0;                            // 물

    for (int i = answer.length()-2; i >= 0; i--) { // 뒤집어서 값을 넣어줌
      answer += answer.charAt(i);
    }
    return answer;
  }

  /* 간결 코드
    String answer = "0";

      for (int i = food.length - 1; i > 0; i--) {
          for (int j = 0; j < food[i] / 2; j++) {
              answer = i + answer + i;
          }
      }
      return answer;
   */

  public static void main(String[] args) {

    int[] food = {1, 3, 4, 6};
    System.out.println(solution(food));
  }

}
