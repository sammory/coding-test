package Programmers.lv1;

import java.util.ArrayList;
import java.util.List;

public class P49_같은숫자는싫어 {
    public static int[] solution(int []arr) {
        List<Integer> num = new ArrayList<>();
        int temp = -1;

        for (int i = 0; i < arr.length; i++) {
            if (temp != arr[i]) {
                num.add(arr[i]);
                temp = arr[i];
            }
        }
        int[] answer = new int[num.size()];

        for (int i = 0; i < num.size(); i++) {
            answer[i] = num.get(i);
        }

        return answer;
    }
    public static void main(String[] arg) {
        int[] arr = {1, 1, 3, 3, 0, 1, 1};
        System.out.println(solution(arr));
    }
}
