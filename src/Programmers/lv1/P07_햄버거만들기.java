package Programmers.lv1;

import java.util.Stack;
/*
상수의 앞에 쌓이는 재료의 순서가 [야채, 빵, 빵, 야채, 고기, 빵, 야채, 고기, 빵]일 때,
 상수는 여섯 번째 재료가 쌓였을 때, 세 번째 재료부터 여섯 번째 재료를 이용하여
 햄버거를 포장하고, 아홉 번째 재료가 쌓였을 때, 두 번째 재료와 일곱 번째 재료부터
 아홉 번째 재료를 이용하여 햄버거를 포장합니다. 즉, 2개의 햄버거를 포장하게 됩니다.
 */
public class P07_햄버거만들기 {
  public static int solution(int[] ingredient) {
    int answer = 0;
    Stack<Integer> arr = new Stack<>();

    for (int s : ingredient) {
      arr.push(s);
      if (arr.size() >= 4) {             // 스택에 값이 4개 이상 쌓였을때 햄버거순서 1234와 비교
        int arrSize = arr.size();
        if (arr.get(arrSize-4) == 1      // 뒤에서부터 4자리값을 비교하여 1234 순서가 맞으면  answer 추가 후 pop 으로 삭제
        && arr.get(arrSize-3) == 2
        && arr.get(arrSize-2) == 3
        && arr.get(arrSize-1) == 1) {
          answer++;
          arr.pop();
          arr.pop();
          arr.pop();
          arr.pop();                     // pop 으로 삭제 후 다시 for 문 돌면서 다음 값 넣고 실행
        }
      }
    }
    return answer;
  }

  public static void main(String[] args) {

    int[] ingredient = {2, 1, 1, 2, 3, 1, 2, 3, 1};
    System.out.println(solution(ingredient));
  }

}
