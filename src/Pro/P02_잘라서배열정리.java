package Pro;

import java.util.ArrayList;

public class P02_잘라서배열정리 {

    //잘라서 배열로 정리하기 11/1

    public static ArrayList solution(String my_str, int n) {
        ArrayList<String> answer = new ArrayList<>();
        int i = 0;

        while (true) {
            if (i + n >= my_str.length()) {
                answer.add(my_str.substring(i,my_str.length()));
                break;
            }
            answer.add(my_str.substring(i, i + n));
            i += n;

        }
        return answer;

    }

    public static void main(String[] args) {

        String my_str = "abcdefghij";
        int n = 3;

        System.out.println(my_str.length());
        System.out.println(solution(my_str,n));

    }
}
