package Pro;

//약수 구하기

public class P17_약수구하기 {
    public static int[] solution(int n) {
        int[] arr = new int[n+1];
        int cnt = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                arr[cnt] = i;
                cnt++;
            }
        }

        int[] answer = new int[cnt];

        for (int i = 0; i < cnt; i++) {
            answer[i] = arr[i];
            System.out.println(answer[i]);
        }

        return answer;
    }

    public static void main(String[] args) {

        int n = 24;
        System.out.println(solution(n));
    }
}
