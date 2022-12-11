package Programmers;
/*
    선분 3개가 평행하게 놓여 있습니다.
    세 선분의 시작과 끝 좌표가 [[start, end], [start, end], [start, end]] 형태로
    들어있는 2차원 배열 lines 가 매개변수로 주어질 때, 두 개 이상의 선분이 겹치는 부분의
    길이를 return 하도록 solution 함수를 완성해보세요.
 */

public class P33_겹치는선분길이 {
    public static int solution(int[][] lines) {
        int answer = 0;
        int[] arr = new int[200]; // 제합값 마이너스부분 상쇄

        for (int i = 0; i < lines.length; i++) {
            for (int j = lines[i][0] + 100; j < lines[i][1] + 100; j++) { // 기존값에 +100 위치부터 입력
                arr[j]++;
            }
        }

        for (int i = 0; i < arr.length; i++) { // 겹치는 부분 1이상의 값
            if (arr[i] > 1) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        int[][] lines = new int[][]{{0,1}, {2,5}, {3,9}};
        System.out.println(solution(lines));
    }
}
