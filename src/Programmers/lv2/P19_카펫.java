package Programmers.lv2;

import Programmers.lv1.P58_약수의합;

/* 완전탐색
    Leo가 본 카펫에서 갈색 격자의 수 brown, 노란색 격자의 수 yellow가 매개변수로 주어질 때
    카펫의 가로, 세로 크기를 순서대로 배열에 담아 return 하도록 solution 함수를 작성해주세요.
 */
public class P19_카펫 {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        // 전체 칸수
        int sum = brown + yellow;

        for (int i = 1; i <= sum; i++) {
            int row = i;          // 세로
            int col = sum / i;    // 가로

            // 카펫의 가로길이는 세로길이와 같거나 크다
            if (row > col) continue;

            // (가로 - 2) * (세로 - 2 ) = yellow 의 개수이다
            if ((row - 2) * (col - 2) == yellow) {
                answer[0] = col;
                answer[1] = row;
                break;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        P19_카펫 q = new P19_카펫();

        int brown = 10;
        int yellow = 2;
        System.out.println(q.solution(brown,yellow));
    }
}
