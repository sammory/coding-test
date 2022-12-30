package Programmers.lv1;
/*
    가장 긴 가로 길이와 세로 길이가 각각 80, 70이기 때문에
    80(가로) x 70(세로) 크기의 지갑을 만들면 모든 명함들을 수납할 수 있습니다.
    하지만 2번 명함을 가로로 눕혀 수납한다면 80(가로) x 50(세로) 크기의 지갑으로
    모든 명함들을 수납할 수 있습니다. 이때의 지갑 크기는 4000(=80 x 50)입니다.
 */
public class P11_최소직사각형 {
    public static int solution(int[][] sizes) {
        int answer = 0;
        int x = 0;
        int y = 0;

        for (int i = 0; i < sizes.length; i++) {
            if (x < Math.max(sizes[i][0], sizes[i][1])) { // 두수를 비교하여 큰값중에서 큰값
                x = Math.max(sizes[i][0], sizes[i][1]);
            }
            if (y < Math.min(sizes[i][0], sizes[i][1])) { // 두수를 비교하여 작은값중에서 큰값
                y = Math.min(sizes[i][0], sizes[i][1]);
            }
        }
        answer = x * y;
        
        return answer;
    }

    public static void main(String[] args) {

        int[][] sizes = new int[][]{{10, 7}, {12,3}, {8,15}, {14,7}, {5,15}};
        System.out.println(solution(sizes));
    }
}
