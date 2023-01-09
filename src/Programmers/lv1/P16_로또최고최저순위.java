package Programmers.lv1;

public class P16_로또최고최저순위 {
    public static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int zeroCnt = 0;
        int same = 0;

        for (int s : lottos) {        // 0 일때  카운트
            if ( s == 0 ) {
                zeroCnt++;
                continue;
            }
            for (int x : win_nums) {  // 같은 숫자 일때 카운트
                if (s == x) {
                    same++;
                }
            }
        }

        int min = same;
        int max = same + zeroCnt;
        answer[0] = Math.min(7 - max, 6);    // 맞춘값과 0값만 생각  = 최저 등수에서 맞춘값(전체맞은수량) 뺀 후 min 값을 최고순위로
        answer[1] = Math.min(7 - min, 6);    // 맞춘값만생각        = 최저 등수에서 zeroCnt 제외하고 맞춤값 뺀 후 min 값을 최저순위로

        return answer;
    }
    public static void main(String[] args) {

        int[] lottos = {0, 0, 0, 0, 0, 0};
        int[] win_nums = {31, 10, 45, 1, 6, 19};
        System.out.println(solution(lottos, win_nums));
    }
}
