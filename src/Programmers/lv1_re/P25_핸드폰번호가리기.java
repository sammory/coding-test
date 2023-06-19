package Programmers.lv1_re;

public class P25_핸드폰번호가리기 {
    public String solution(String phone_number) {
        String answer = "";
        StringBuilder sb = new StringBuilder();

        // 맨끝 4자리를 제외한 수만큼 *표시 추가
        for (int i = 0; i < phone_number.length() - 4; i++) {
            sb.append("*") ;
        }
        // 맨끝 4자리만큼 잘라서 추가
        sb.append(phone_number.substring(phone_number.length() - 4));
        answer = sb.toString();

        return answer;
    }
    public static void main(String[] args) {
        P25_핸드폰번호가리기 q = new P25_핸드폰번호가리기();

        String phone_number = "01033334444";
        System.out.println(q.solution(phone_number));
    }
}
