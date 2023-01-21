package Programmers.lv1;

import java.util.ArrayList;
import java.util.List;

public class P25_모의고사 {
    public static int[] solution(int[] answers) {

        int[] num1 = {1,2,3,4,5};
        int[] num2 = {2,1,2,3,2,4,2,5};
        int[] num3 = {3,3,1,1,2,2,4,4,5,5};

        int[] cnt = new int[3];

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == num1[i % num1.length]) cnt[0]++;    // num 배열의 길이만큼 반복하여 맞은만큼 cnt 추가
            if (answers[i] == num2[i % num2.length]) cnt[1]++;
            if (answers[i] == num3[i % num3.length]) cnt[2]++;
        }
        int max = Math.max(cnt[0],Math.max(cnt[1], cnt[2]));      // max 값
        List<Integer> score = new ArrayList<>();

        if (max == cnt[0]) score.add(1);                          // max 값을 list 에 순서대로 추가
        if (max == cnt[1]) score.add(2);
        if (max == cnt[2]) score.add(3);

        int[] answer = new int[score.size()];                     // 구한 값을 int 배열에 추가
        for(int i = 0; i < score.size(); i++) {
            answer[i] = score.get(i);
        }

        return answer;
    }
    public static void main(String[] args) {


        int[] answers = {1,2,3,4,5};
        System.out.println(solution(answers));
    }
}
