package Programmers.lv1;
/*
    게임 화면의 격자의 상태가 담긴 2차원 배열 board와 인형을 집기 위해 크레인을
    작동시킨 위치가 담긴 배열 moves가 매개변수로 주어질 때, 크레인을 모두 작동시킨 후
    터트려져 사라진 인형의 개수를 return 하도록 solution 함수를 완성해주세요.
 */
import java.util.Stack;

public class P23_크레인인형 {
    public static int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> basket = new Stack<>();  // 인형을 담을 바구니

        for (int i = 0; i < moves.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[j][moves[i] - 1] != 0) {                     // 바구니에 인형이 있을떄
                    if (basket.empty()) {
                        basket.push(board[j][moves[i] - 1]);
                    } else {
                        if (basket.peek() == board[j][moves[i] - 1]) {  // 바구니에 이미 같은 인형이 있을때 인형수량 추가 후 바구니안에 인형 제거
                            answer += 2;
                            basket.pop();
                        } else {
                            basket.push(board[j][moves[i] - 1]);        // 바구니에 다른 같은인형이 아닐때 크레인으로 잡아온 인형 추가
                        }
                    }
                    board[j][moves[i] - 1] = 0;                         // 현재 작업한 인형은 0으로 초기화
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] moves = {1,5,3,5,1,2,1,4};
        System.out.println(solution(board,moves));
    }
}
