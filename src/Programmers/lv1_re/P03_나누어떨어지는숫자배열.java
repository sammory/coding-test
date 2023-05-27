package Programmers.lv1_re;

import java.util.ArrayList;
import java.util.Arrays;

public class P03_나누어떨어지는숫자배열 {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();

        // 나누어 떨어지는 수는 list에 저장
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                list.add(arr[i]);
            }
        }
        // 나누어 떨어지는 수가 없을때 -1리턴
        if (list.size() < 1) {
            answer = new int[]{-1};
            return answer;
        }
        // list에 저장된 값을 answer에 입력
        answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        // 오른차순으로 정렬
        Arrays.sort(answer);

        return answer;
    }

    public static void main(String[] args) {
        P03_나누어떨어지는숫자배열 q = new P03_나누어떨어지는숫자배열();

        int[] arr = {3,2,6};
        int divisor = 10;
        System.out.println(q.solution(arr,divisor));
    }
}
