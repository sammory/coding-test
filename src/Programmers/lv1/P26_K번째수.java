package Programmers.lv1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/*
    array의 2번째부터 5번째까지 자르면 [5, 2, 6, 3]입니다.
    1에서 나온 배열을 정렬하면 [2, 3, 5, 6]입니다.
    2에서 나온 배열의 3번째 숫자는 5입니다.
 */

public class P26_K번째수 {
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            List<Integer> arr = new ArrayList<>();

            for (int j = commands[i][0] - 1; j < commands[i][1]; j++) {  // commands 에 있는 0번째 1번째 수를 이용해 array 의 실제 사이값을 구해서 추가
                arr.add(array[j]);
            }
            Collections.sort(arr);                                       // List 를 오름차순으로 정렬
            answer[i] = arr.get(commands[i][2] - 1);                     // commands 에 지정된 마지막값을 array 의 index 값으로 받아와 추가

        }
        return answer;
    }

    /* copyOfRange 를 이용한 다른 풀이법
    int[] answer = new int[commands.length];

        for(int i=0; i<commands.length; i++){
            int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2]-1];
        }

        return answer;
     */

    public static void main(String[] args) {

        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        System.out.println(solution(array, commands));
    }
}
