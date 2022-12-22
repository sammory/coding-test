package Programmers.lv1;
/*
먼저 첫 글자를 읽습니다. 이 글자를 x라고 합시다.
이제 이 문자열을 왼쪽에서 오른쪽으로 읽어나가면서, x와 x가 아닌
다른 글자들이 나온 횟수를 각각 셉니다. 처음으로 두 횟수가 같아지는
순간 멈추고, 지금까지 읽은 문자열을 분리합니다.
s에서 분리한 문자열을 빼고 남은 부분에 대해서 이 과정을 반복합니다. 남은 부분이 없다면 종료합니다.
만약 두 횟수가 다른 상태에서 더 이상 읽을 글자가 없다면, 역시 지금까지 읽은 문자열을 분리하고, 종료합니다.
 */
public class P02_문자열나누기 {
    public static int solution(String s) {
        int answer = 0;
        char x = s.charAt(0);
        int cnt1 = 0;
        int cnt2 = 0;

        for (int i = 0; i < s.length(); i++) {
            if (cnt1 == cnt2) {  // 등장 횟수가 같아 질때마다 answer 추가
                answer++;
                x = s.charAt(i); // 추가 한뒤에 새로시작 i 번째와 그다음번째 비교를 위해 x값을 업데이트
            }
            if (x == s.charAt(i)) { // cnt1과 cnt2 의 등장 수를 체크
                cnt1++;
            } else {
                cnt2++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        String s = "aaabbaccccabba";
        System.out.println(solution(s));
    }
}

