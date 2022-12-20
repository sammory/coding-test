package Programmers.lv0;
/*
    머쓱이는 RPG 게임을 하고 있습니다. 게임에는 up, down, left, right 방향키가
    있으며 각 키를 누르면 위, 아래, 왼쪽, 오른쪽으로 한 칸씩 이동합니다.
    예를 들어 [0,0]에서 up을 누른다면 캐릭터의 좌표는 [0, 1], down 을
    누른다면 [0, -1], left 를 누른다면 [-1, 0], right 를 누른다면 [1, 0]입니다.
    머쓱이가 입력한 방향키의 배열 keyinput 와 맵의 크기 board 이 매개변수로 주어집니다.
    캐릭터는 항상 [0,0]에서 시작할 때 키 입력이 모두 끝난 뒤에 캐릭터의 좌표 [x, y]를
    return 하도록 solution 함수를 완성해주세요.
 */

public class P40_캐릭터의좌표 {
    public static int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0,0};
        int width = board[0]/2; // 좌표의 중간 위치를 위해 나누기2
        int vertical = board[1]/2;


        for (int i = 0; i < keyinput.length; i++) {
            if (keyinput[i].equals("left")) {
                if (answer[0] > -(width)) {  // 마이너스 리미트값때문에 부호 변환
                    answer[0]--;
                }
            } else if (keyinput[i].equals("right")) {
                if (answer[0] < width) {
                    answer[0]++;
                }
            } else if (keyinput[i].equals("up")) {
                if (answer[1] < vertical) {
                    answer[1]++;
                }
            } else {
                if (answer[1] > -(vertical)) {
                    answer[1]--;
                }
            }

        }

        return answer;
    }

    public static void main(String[] args) {

        String[] keyinput = {"down", "down", "down", "down", "down"};
        int[] board = {7, 9};
        System.out.println(solution(keyinput, board));
    }
}
