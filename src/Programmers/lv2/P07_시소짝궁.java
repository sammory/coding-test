package Programmers.lv2;

import java.util.Arrays;

public class P07_시소짝궁 {
    int len;

    public long solution(int[] weights) {
        long answer = 0;
        len = weights.length;
        Arrays.sort(weights);
        int prev = 0;
        for (int i = 0; i < len - 1; i++) {
            // 중복된 수를 처리하기 위한 예외처리
            if (i > 0 && weights[i] == weights[i - 1]) {
                if (prev > 0) {
                    prev--;
                }
                answer += prev;
                continue;
            }
            int j = findRight(weights, weights[i], i + 1);
            prev = 0;
            for (; j > i; j--) {
                // 1:2, 2:3, 3:4 비율에 해당하는 수를 찾아 prev 변수에 추가
                if (weights[i] == weights[j] || weights[i] * 2 == weights[j] || weights[i] * 3 == weights[j] * 2
                        || weights[i] * 4 == weights[j] * 3) {
                    prev++;
                }
            }
            answer += prev;
        }
        return answer;
    }

    // 이진 탐색으로 범위를 좁혀나가는 함수
    public int findRight(int[] w, int num, int i) {
        int left = i;
        int right = len - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (w[mid] > num * 2)
                return mid;
            else
                left = mid + 1;
        }
        return left;
    }

    public static void main(String[] args) {
        P07_시소짝궁 q = new P07_시소짝궁();
        int[] weights = { 100, 180, 360, 100, 270 };
        long answer = q.solution(weights);
        System.out.println(answer); // 4 출력
    }
}
