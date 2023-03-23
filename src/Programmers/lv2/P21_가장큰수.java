package Programmers.lv2;
/*
    0 또는 양의 정수가 주어졌을 때, 정수를 이어 붙여 만들 수 있는 가장 큰 수를 알아내 주세요.
    예를 들어, 주어진 정수가 [6, 10, 2]라면 [6102, 6210, 1062, 1026, 2610, 2106]를 만들 수 있고, 이중 가장 큰 수는 6210입니다.
 */
import java.util.Arrays;
import java.util.Comparator;

public class P21_가장큰수 {
    public String solution(int[] numbers) {
        String answer = "";
        String[] str = new String[numbers.length];

        // numbers int 값을 String 으로 변환
        for (int i = 0; i < numbers.length; i++) {
            str[i] = String.valueOf(numbers[i]);
        }
        // 내림차순 정렬
        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2 + o1).compareTo(o1 + o2);
            }
        });
        //0값이 중복일경우 ex){0,0,0}
        //답이 000이 나오면 안되므로 첫번째값이 0이면 0을 리턴
        if (str[0].equals("0")) return "0";

        //0이 아니면 문자열을 더해준다.
        for(String s: str) answer += s;

        return answer;
    }
    public static void main(String[] args) {
        P21_가장큰수 q = new P21_가장큰수();

        int[] numbers = {6, 10, 2};
        System.out.println(q.solution(numbers));
    }
}
