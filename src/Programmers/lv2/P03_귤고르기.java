package Programmers.lv2;

import java.util.*;

/*
    경화가 한 상자에 담으려는 귤의 개수 k와 귤의 크기를 담은 배열 tangerine이 매개변수로 주어집니다.
    경화가 귤 k개를 고를 때 크기가 서로 다른 종류의 수의 최솟값을 return 하도록 solution 함수를 작성해주세요.
 */
public class P03_귤고르기 {
    public static int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer, Integer> m=new HashMap<>();

        // 귤사이즈별 정리
        for(int t:tangerine){
            m.put(t,m.getOrDefault(t, 0)+1);
        }

        // keyList 생성
        List<Integer> list=new ArrayList<>(m.values());
        //keyList 내림차순정렬
        Collections.sort(list, Collections.reverseOrder());

        for(Integer a:list){
            k -= a;
            answer++;
            if(k < 1){
                return answer;
            }
        }

        return answer;

    }
    public static void main(String[] arg) {

        int k = 6;
        int[] tangerine = {1, 3, 2, 5, 4, 5, 2, 3};
        System.out.println(solution(k,tangerine));
    }
}
