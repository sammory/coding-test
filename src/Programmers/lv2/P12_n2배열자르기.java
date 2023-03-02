package Programmers.lv2;
/*
    n행 n열 크기의 비어있는 2차원 배열을 만듭니다.
    i = 1, 2, 3, ..., n에 대해서, 다음 과정을 반복합니다.
    1행 1열부터 i행 i열까지의 영역 내의 모든 빈 칸을 숫자 i로 채웁니다.
    1행, 2행, ..., n행을 잘라내어 모두 이어붙인 새로운 1차원 배열을 만듭니다.
    새로운 1차원 배열을 arr이라 할 때, arr[left], arr[left+1], ..., arr[right]만 남기고 나머지는 지웁니다.
 */
public class P12_n2배열자르기 {
    public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int)(right - left) + 1];

        int idx = 0;
        for (long i = left; i <= right; i++) {
            // i/n(행값), i%n(열값)
            answer[idx++] = (int)Math.max(i / n, i % n) + 1;
        }

        return answer;
    }
    public static void main(String[] args) {
        P12_n2배열자르기 q = new P12_n2배열자르기();

        int n = 3;
        int left = 2;
        int right = 5;
        System.out.println(q.solution(n,left,right));
    }
}
