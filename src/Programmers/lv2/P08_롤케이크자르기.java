package Programmers.lv2;

import java.util.HashMap;
import java.util.HashSet;

public class P08_롤케이크자르기 {
    public int solution(int[] topping) {
        int answer = 0;
        int size = topping.length;

        HashSet<Integer> first = new HashSet<>();
        HashMap<Integer, Integer> second = new HashMap<>();

        // 철수가 첫번째 케익을 가지고 있음
        first.add(topping[0]);
        // 첫번째 케익을 제외한 나머지 케익을 동생이 가지고있음
        for (int i = 1; i < size; i++) {
            second.put(topping[i], second.getOrDefault(topping[i], 0) + 1);
        }
        // 동생이 가지고 있는 케익을 하나씩 빼고 철수에게 추가
        // 동생의 케익이 0이 되어서 가지수가 줄어들고 둘의 가지수가 동일 할떄 마다 answer 추가
        for (int i = 1;i < size; i++) {
            first.add(topping[i]);
            second.put(topping[i], second.get(topping[i]) - 1);
            if (second.get(topping[i]) == 0) {  // 동생의 케익수가 0 이되면 사이즈 줄이기 위해 remove 로 제거
                second.remove(topping[i]);
            }
            if (first.size() == second.size())  // 사이즈 비교 후 answer 추가
                answer++;
        }


        return answer;
    }
    public static void main(String[] args) {
        P08_롤케이크자르기 q = new P08_롤케이크자르기();

        int[] topping = {1, 2, 1, 3, 1, 4, 1, 2};
        System.out.println(q.solution(topping));
    }
}
