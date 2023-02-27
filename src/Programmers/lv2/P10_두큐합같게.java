package Programmers.lv2;

import java.util.LinkedList;
import java.util.Queue;
/*
    길이가 같은 두 개의 큐가 주어집니다. 하나의 큐를 골라 원소를 추출(pop)하고,
    추출된 원소를 다른 큐에 집어넣는(insert) 작업을 통해 각 큐의 원소 합이 같도록 만들려고 합니다.
    이때 필요한 작업의 최소 횟수를 구하고자 합니다. 한 번의 pop과 한 번의 insert를 합쳐서 작업을 1회 수행한 것으로 간주합니다.
 */
public class P10_두큐합같게 {
    public int solution(int[] queue1, int[] queue2) {
        Queue<Integer> que1 = new LinkedList<>();
        Queue<Integer> que2 = new LinkedList<>();

        long sum1 = 0;
        long sum2 = 0;
        // 각각의 배열의 합을 넣고, 값을 queue 에 넣는다.
        for (int i = 0; i < queue1.length; i++) {
            sum1 += queue1[i];
            que1.offer(queue1[i]);
            sum2 += queue2[i];
            que2.offer(queue2[i]);
        }
        // 두 큐의 합계를 비교 하고, 합이 큰값에서 하나씩 뺄때마다 작은값에는 추가해주며 비교.
        int cnt = 0;
        while (sum1 != sum2) {
            cnt++;
            if (sum1 > sum2) {
                int value = que1.poll();
                sum1 -= value;
                sum2 += value;
                que2.offer(value);
            } else {
                int value = que2.poll();
                sum1 += value;
                sum2 -= value;
                que1.offer(value);
            }
            // 큐의 원소 합을 같게 만들 수 없는 경우
            if (cnt > (queue1.length + queue2.length) * 2) return -1;
        }

        return cnt;
    }
    public static void main(String[] args) {
        P10_두큐합같게 q = new P10_두큐합같게();

        int[] queue1 = {3, 2, 7, 2};
        int[] queue2 = {4, 6, 5, 1};
        System.out.println(q.solution(queue1,queue2));
    }
}
