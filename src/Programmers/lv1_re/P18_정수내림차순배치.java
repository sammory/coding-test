package Programmers.lv1_re;

import java.util.Arrays;

/*
    함수 solution은 정수 n을 매개변수로 입력받습니다.
    n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요.
    예를들어 n이 118372면 873211을 리턴하면 됩니다.
 */
public class P18_정수내림차순배치 {
    public long solution(long n) {
        long answer = 0;
        int[] arr = new int[(int)Math.log10(n) + 1]; // 숫자의 자리수

        long num = 0;
        int cnt = 0;
        while (n >= 1) { // 1보다 크거나 같을때까지 반복, 1의 자리수 하나씩 arr에 저장
            num = n % 10;
            n /= 10;
            arr[cnt] = (int)num;
            cnt++;
        }

        Arrays.sort(arr); // 내림차순 정렬
        for (int i = arr.length - 1; i >= 0; i--) { // 오름차순으로 정렬
            answer = answer * 10 + arr[i];
        }

        return answer;
    }
    public static void main(String[] args) {
        P18_정수내림차순배치 q = new P18_정수내림차순배치();

        long n = 118372;
        System.out.println(q.solution(n));
    }
}
