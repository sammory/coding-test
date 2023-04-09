package Programmers.lv2;
/*
    전화번호부에 적힌 전화번호를 담은 배열 phone_book 이 solution 함수의 매개변수로 주어질 때,
    어떤 번호가 다른 번호의 접두어인 경우가 있으면 false를 그렇지 않으면 true를 return 하도록 solution 함수를 작성해주세요.
 */
import java.util.HashMap;

public class P27_전화번호목록 {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        HashMap<String, Integer> map = new HashMap<>();
        // map에 전화번호를 입력
        for (int i = 0; i < phone_book.length; i++) {
            map.put(phone_book[i], i);
        }

        for (int i = 0; i < phone_book.length; i++) {
            // phone_book의 각각의 인덱스의 길이만큼 반복
            for (int j = 0; j < phone_book[i].length(); j++) {
                // map에 존재하는지 확인
                if (map.containsKey(phone_book[i].substring(0, j)))
                    return false;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        P27_전화번호목록 q = new P27_전화번호목록();

        String[] phone_book = {"119", "97674223", "1195524421"};
        System.out.println(q.solution(phone_book));
    }
}
