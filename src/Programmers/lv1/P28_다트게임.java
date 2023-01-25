package Programmers.lv1;

public class P28_다트게임 {
    public static int solution(String dartResult) {
        int answer = 0;
        int[] dart = new int[3];

        int n = 0, idx = 0;
        String numstr = "";

        for (int i = 0; i < dartResult.length(); i++) {
            char c = dartResult.charAt(i);                      // 한자리씩 값을 뽑음

            //숫자일 때
            if (c >= '0' && c <= '9') {                         // 숫자일때와 문자일때를 나누어 값 저장
                numstr += String.valueOf(c);

            }
            //보너스일 때
            else if (c == 'S' || c == 'D' || c == 'T') {        // S,D,T 일때 해당값 제곱값으로 dart 0번 인덱스부터 넣고 인덱스값 1증가
                n = Integer.parseInt(numstr);
                if (c == 'S') {
                    dart[idx++] = (int) Math.pow(n, 1);
                } else if (c == 'D') {
                    dart[idx++] = (int) Math.pow(n, 2);
                } else {
                    dart[idx++] = (int) Math.pow(n, 3);
                }
                numstr = "";
            }
            //옵션일 때
            else {                                              // * 일때 현재 값과 이전값에 곱하기 2
                if (c == '*') {
                    dart[idx - 1] *= 2;
                    if (idx - 2 >= 0) dart[idx - 2] *= 2;
                } else {                                        // # 일때 현재 값은 마이너스
                    dart[idx - 1] *= (-1);
                }
            }
        }

        answer = dart[0] + dart[1] + dart[2];

        return answer;
    }
    public static void main(String[] args) {

        String dartResult = "1S2D*3T";

        System.out.println(solution(dartResult));
    }
}
