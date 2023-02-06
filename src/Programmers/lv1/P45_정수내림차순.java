package Programmers.lv1;

import java.util.ArrayList;
import java.util.Collections;

/*
    함수 solution은 정수 n을 매개변수로 입력받습니다.
     n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요.
     예를들어 n이 118372면 873211을 리턴하면 됩니다.
 */
public class P45_정수내림차순 {
    public static long solution(long n) {
        long answer = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        long num = 0;

        while (n > 0) {
            num = n % 10;
            n /= 10;
            arr.add((int) num);
        }

        Collections.sort(arr, Collections.reverseOrder());
        String str = "";
        for (int i = 0; i < arr.size(); i++) {
            str += arr.get(i);
        }

        answer = Long.parseLong(str);

        return answer;
    }

    /* 간결 코드
    public long solution(long n) {
        long answer = 0;

        String[] str = Long.toString(n).split("");
        Arrays.sort(str, Collections.reverseOrder());

        String answ = "";

        for(String s : str)
           answ += s;

        answer = Long.parseLong(answ);

        return answer;
    }
     */

    public static void main(String[] args) {
        long n = 118372;
        System.out.println(solution(n));
    }
}
