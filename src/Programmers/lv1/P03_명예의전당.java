package Programmers.lv1;
import java.util.*;
/*
이 프로그램에서는 매일 "명예의 전당"의 최하위 점수를 발표합니다.
예를 들어, k = 3이고, 7일 동안 진행된 가수의 점수가 [10, 100, 20, 150, 1, 100, 200]이라면,
명예의 전당에서 발표된 점수는 아래의 그림과 같이 [10, 10, 10, 20, 20, 100, 100]입니다.
 */

public class P03_명예의전당 {
    public static int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> sc = new ArrayList();
        for (int i = 0; i < score.length; i++) {     // 0부터 k값 전까지는 sc에 추가하고
            if (i < k-1){
                sc.add(score[i]);
                sc.sort(Collections.reverseOrder()); // 내림차순으로 정렬
                answer[i]=sc.get(sc.size()-1);       // sc의 마지막값을 추가
            } else if (i >= k-1){                    // k값과 같거나 클때는 k-1번째 값 추가
                sc.add(score[i]);
                sc.sort(Collections.reverseOrder());
                answer[i]=sc.get(k-1);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int k = 3;
        int[] score = {10, 100, 20, 150, 1, 100, 200};
        System.out.println(solution(k,score));
    }
}
