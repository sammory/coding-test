package Programmers.lv1;
/*
    두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환하는 함수, solution을 완성해 보세요.
    배열의 맨 앞에 최대공약수, 그다음 최소공배수를 넣어 반환하면 됩니다.
     예를 들어 두 수 3, 12의 최대공약수는 3, 최소공배수는 12이므로 solution(3, 12)는 [3, 12]를 반환해야 합니다.
 */
public class P60_최대공약수최소공배수 {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];

        // 큰 수
        int a = Math.max(n,m);
        // 작은 수
        int b = Math.min(n,m);
        // 작은수(나누는 수)가 0이 될 때까지 반복
        while(b > 0){
            // 작은 수(나누는 수)의 임시 변수
            int temp = b;
            // 나머지가 나누는 수가 된다.
            b = a % b;
            // 작은수가 큰 수가 된다.
            a = temp;
        }
        // 최대 공약수
        answer[0] = a;
        // 최소 공배수
        answer[1] = n * m / a;

        return answer;
    }
    public static void main(String[] args) {
        P60_최대공약수최소공배수 q = new P60_최대공약수최소공배수();

        int n = 2;
        int m = 5;
        System.out.println(q.solution(n,m));
    }
}
