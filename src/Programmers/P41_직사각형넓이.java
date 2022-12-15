package Programmers;
/*
    2차원 좌표 평면에 변이 축과 평행한 직사각형이 있습니다.
    직사각형 네 꼭짓점의 좌표 [[x1, y1], [x2, y2], [x3, y3], [x4, y4]]가
    담겨있는 배열 dots가 매개변수로 주어질 때, 직사각형의 넓이를 return
    하도록 solution 함수를 완성해보세요.
 */

public class P41_직사각형넓이 {
    public static int solution(int[][] dots) {
        int answer = 0;
        int x = 0;
        int y = 0;

        for (int i = 0; i < dots.length; i++) {
            for (int j = i+1; j < dots.length; j++) {
                if (dots[i][0] != dots[j][0] && dots[i][1] != dots[j][1]) { // x,y 둘다 다른조건을 찾고 차이값을 구하여 넓이계산
                    x = (Math.max(dots[i][0], dots[j][0])) - (Math.min(dots[i][0], dots[j][0]));
                    y = (Math.max(dots[i][1], dots[j][1])) - (Math.min(dots[i][1], dots[j][1]));

                }
            }
        }
        answer = x * y;

        return answer;
    }

    public static void main(String[] args) {

        int[][] dots = new int[][]{ {1,1}, {2,1}, {2,2}, {1,2}};
        System.out.println(solution(dots));
    }
}
