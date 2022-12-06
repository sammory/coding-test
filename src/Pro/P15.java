package Pro;

import java.util.Arrays;

//가장 큰수 찾기

public class P15 {

    public static int[] solution(int[] array) {
        int[] answer = new int[2];

        int max = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                answer[0] = max;
                answer[1] = i;

            }
        }
        System.out.println(Arrays.toString(answer));

        return answer;
    }

    public static void main(String[] args) {

        int[] array = { 1, 8, 3 };

    }
}