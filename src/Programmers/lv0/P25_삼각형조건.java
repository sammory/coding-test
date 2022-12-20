package Programmers.lv0;

// 삼각형의 완성조건 12/8

import java.util.Arrays;

public class P25_삼각형조건 {
    public static int solution(int[] sides) {
        int answer;

        Arrays.sort(sides);

        if (sides[0] + sides[1] > sides[2]) {
            answer = 1;
        } else answer = 2;

        return answer;
    }

    public static void main(String[] args) {

        int[] sides = {1, 2, 3};
        System.out.println(solution(sides));
    }
}
