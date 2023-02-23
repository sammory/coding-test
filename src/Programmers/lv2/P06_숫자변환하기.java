package Programmers.lv2;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class P06_숫자변환하기 {
    public static int solution(int x, int y, int n) {
        int cnt = 0;
        Queue<Integer> q = new LinkedList<>();
        Set<Integer> hs = new HashSet<>();
        q.offer(x);

        while(!q.isEmpty()) {
            int size = q.size();
            for(int i = 0 ; i < size ; i++) {
                if(q.peek() == y) {
                    return cnt;
                }
                // 모든 연산을 한번씩 하고 q의 맨앞에 값을 삭제 후 반환(q 값을 하나씩 지워가며 비교하고 추가 연산)
                helper(q.poll(), y, n, hs, q);
            }
            cnt++;
        }
        return -1;
    }

    public static void helper(int num, int y, int n, Set<Integer> hs, Queue<Integer> q) {
        // 삭제반환 받은 값으로 나머지 연산 진행하고 조건에 y보다 작거나 같으면 hs와 q에 추가
        if(num+n <= y && !hs.contains(num + n)) {
            hs.add(num + n);
            q.offer(num+n);
        }
        if(num * 2 <= y && !hs.contains(num * 2)) {
            hs.add(num * 2);
            q.offer(num * 2);
        }
        if(num * 3 <= y && !hs.contains(num * 3)) {
            hs.add(num * 3);
            q.offer(num * 3);
        }
    }

    public static void main(String[] arg) {

        int x = 10;
        int y = 40;
        int n = 5;
        System.out.println(solution(x,y,n));
    }
}
