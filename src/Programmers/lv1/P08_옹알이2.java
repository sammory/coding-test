package Programmers.lv1;
/*
  머쓱이는 태어난 지 11개월 된 조카를 돌보고 있습니다.
  조카는 아직 "aya", "ye", "woo", "ma" 네 가지 발음과 네 가지
  발음을 조합해서 만들 수 있는 발음밖에 하지 못하고 연속해서 같은
  발음을 하는 것을 어려워합니다. 문자열 배열 babbling 이 매개변수로 주어질 때,
  머쓱이의 조카가 발음할 수 있는 단어의 개수를 return 하도록 solution 함수를 완성해주세요.
 */
public class P08_옹알이2 {
  public static int solution(String[] babbling) {
    int answer = 0;

    for (int i=0; i<babbling.length; i++) {       // for 문을 돌리면서 발음할수있는 단어별로 숫자로 변환
      String a = babbling[i];
      a = a.replace("aya","1");
      a = a.replace("ye", "2");
      a = a.replace("woo","3");
      a = a.replace("ma","4");
      // 알파벳이 포함되있거나 발음이 중복으로 입력되었을 경우 제외
      if (a.matches("(.*)[a-zA-Z](.*)") || (a.contains("11")||a.contains("22")||a.contains("33")||a.contains("44"))) {

      } else answer++;  // 그 이외의 경우는 1씩 증가
    }
    return answer;
  }

  public static void main(String[] args) {

    String[] babbling = {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};
    System.out.println(solution(babbling));
  }

}
