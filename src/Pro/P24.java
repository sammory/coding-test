package Pro;

import java.util.Arrays;

// 가까운수

public class P24 {
    public static int solution(int[] array, int n) {
        int answer = 0;
        Arrays.sort(array);

        for (int i = 1; i < array.length; i++) {
            if (Math.abs(n - array[0]) > Math.abs(n - array[i])) {
                array[0] = array[i];
            }
        }
        answer = array[0];
        return answer;
    }

    public static void main(String[] args) {

        int[] array = {3, 10, 28, 30};
        int n = 29;
        System.out.println(solution(array,n));
    }
}

