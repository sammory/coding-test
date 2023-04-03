package Programmers.lv2;

import java.util.LinkedList;
import java.util.Queue;

public class P25_다리를지나는트럭 {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;

        Queue<Integer> que = new LinkedList<>();
        int sum = 0; // 다리위 트럭무게 합

        for (int t : truck_weights) {
            while (true) {
                // 큐가 비었을때 다음 트럭 추가
                if (que.isEmpty()) {
                    que.offer(t);
                    sum += t;
                    answer++;
                    break;
                    // 큐사이즈와 다리길이가 같으면 큐의 처음값 뺌
                } else if (que.size() == bridge_length) {
                    sum -= que.poll();
                    // 큐가 비어있지 않을때
                } else {
                    // 다음 트럭과의 합의 무게가 초과될때
                    if (sum + t > weight) {
                        que.offer(0);
                        answer++;
                    } else {
                        // 트럭 합의 무게가 초과가 아닐때
                        que.offer(t);
                        sum += t;
                        answer++;
                        break;
                    }
                }
            }
        }
        // 걸린시간 + 마지막트럭의 통과시간
        return answer + bridge_length;
    }
    public static void main(String[] args) {
        P25_다리를지나는트럭 q = new P25_다리를지나는트럭();

        int bridge_length = 2;
        int weight = 10;
        int[] truck_weights = {7,4,5,6};
        System.out.println(q.solution(bridge_length,weight,truck_weights));
    }
}
