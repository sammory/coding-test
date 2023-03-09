package Programmers.lv2;

public class P16_이진변환반복 {
    public int[] solution(String s) {
        int[] answer = new int[2];

        // 1이 될때까지 반복
        while (s.length() > 1) {
            int cnt = 0;
            for (int i = 0; i < s.length(); i++) {
                // 0의 갯수 체크
                if (s.charAt(i) == '0') answer[1]++;
                // 1의 갯수 체크
                else cnt++;
            }
            // 1의 갯수을 이진변화하여 다시 반복문
            s = Integer.toBinaryString(cnt);
            // 반복 횟수 체크
            answer[0]++;
        }

        return answer;
    }
    public static void main(String[] args) {
        P16_이진변환반복 q = new P16_이진변환반복();

        String s = "110010101001";
        System.out.println(q.solution(s));
    }
}
