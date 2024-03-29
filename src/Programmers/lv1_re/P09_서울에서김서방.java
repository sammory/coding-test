package Programmers.lv1_re;
/*
    String형 배열 seoul의 element중 "Kim"의 위치 x를 찾아, "김서방은 x에 있다"는 String을 반환하는 함수, solution을 완성하세요.
    seoul에 "Kim"은 오직 한 번만 나타나며 잘못된 값이 입력되는 경우는 없습니다.
 */
public class P09_서울에서김서방 {
    public String solution(String[] seoul) {
        String answer = "";

        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {           // Kim의 인덱스를 찾음
                answer = "김서방은 " + i + "에 있다";  // 문자 사이에 인덱스 값을 넣음
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        P09_서울에서김서방 q = new P09_서울에서김서방();

        String[] seoul = {"Jane", "Kim"};
        System.out.println(q.solution(seoul));
    }
}
