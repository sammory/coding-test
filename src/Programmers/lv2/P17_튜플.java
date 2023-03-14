package Programmers.lv2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class P17_튜플 {
    public ArrayList<Integer> solution(String s) {
        // 문자열에서 '{{', '}}' 제거 후 '},{'로 split
        s = s.substring(2, s.length() - 2);
        String[] tuple = s.replace("},{"," ").split(" ");

        // 길이에 따라 정렬
        Arrays.sort(tuple, Comparator.comparing(String::length));
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 0; i < tuple.length; i++) {
            String[] tupleNum = tuple[i].split(",");
            for (int j = 0; j < tupleNum.length; j++) {
                int a = Integer.parseInt(tupleNum[j]);
                if (!answer.contains(a)) {
                    answer.add(a);
                }
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        P17_튜플 q = new P17_튜플();

        String s = "{{2},{2,1},{2,1,3},{2,1,3,4}}";
        System.out.println(q.solution(s));
    }
}
