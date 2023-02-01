package Programmers.lv1;
/*
전화번호가 문자열 phone_number로 주어졌을 때,
전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로 가린 문자열을 리턴하는 함수, solution을 완성해주세요.
 */
public class P34_핸드폰번호가리기 {
    public static String solution(String phone_number) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < phone_number.length()-4; i++) {
            sb.append("*");
        }
        sb.append(phone_number.substring(phone_number.length()-4));

        return sb.toString();
    }
    public static void main(String[] args) {

        String phone_number = "01033334444";
        System.out.println(solution(phone_number));
    }
}
