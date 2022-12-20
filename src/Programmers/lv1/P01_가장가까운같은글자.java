package Programmers.lv1;
/*  12/20
    문자열 s가 주어졌을 때, s의 각 위치마다 자신보다 앞에 나왔으면서,
    자신과 가장 가까운 곳에 있는 같은 글자가 어디 있는지 알고 싶습니다.
    예를 들어, s="banana"라고 할 때,  각 글자들을 왼쪽부터
    오른쪽으로 읽어 나가면서 다음과 같이 진행할 수 있습니다.
 */
public class P01_가장가까운같은글자 {
    public static int[] solution(String s) {
        int[] answer = new int[s.length()];
        answer[0] = -1; // 첫번째는 -1

        for (int i = 1; i < s.length(); i++) {
            // substring 으로 현재 순회중인곳의 앞쪽에서 문자열을 자른뒤
            // 같은 문자 있는지 확인 후 있으면 인덱스차이값 입력, 없으면 기본값 -1 자동반환
            int x = s.lastIndexOf(s.substring(i,i+1), i-1);
            if (x != -1) {
                answer[i] = i-x;
            } else {
                answer[i] = x;
            }
        }

        return answer;
    }
    public static void main(String[] args) {

        String s = "banana";
        System.out.println(solution(s));
    }
}

