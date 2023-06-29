package Programmers.lv1_re;

import java.util.ArrayList;
import java.util.Collections;

/*
    배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수를 구하려 합니다.
    예를 들어 array가 [1, 5, 2, 6, 3, 7, 4], i = 2, j = 5, k = 3이라면
    array의 2번째부터 5번째까지 자르면 [5, 2, 6, 3]입니다.
    1에서 나온 배열을 정렬하면 [2, 3, 5, 6]입니다.
    2에서 나온 배열의 3번째 숫자는 5입니다.
 */
public class P34_k번째수 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            ArrayList<Integer> num = new ArrayList<>();
            // commands 인덱스 0번 1번의 값만큼 array의 숫자를 가져와서 num에 저장
            // 인덱스는 0부터 시작하기 때문에 1번째 자리로 맞추기위해 -1 해줌
            for (int j = commands[i][0] - 1; j < commands[i][1]; j++) {
                num.add(array[j]);
            }
            Collections.sort(num); // 정렬
            answer[i] = num.get(commands[i][2] - 1);
        }

        return answer;
    }
    public static void main(String[] args) {
        P34_k번째수 q = new P34_k번째수();

        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        System.out.println(q.solution(array, commands));
    }
}
