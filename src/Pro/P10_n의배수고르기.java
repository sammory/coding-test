package Pro;

//n의 배수 고르기

public class P10_n의배수고르기 {

    public static int[] solution(int n, int[] numlist) {
        int[] arr = new int[numlist.length];
        int cnt = 0;

        for (int i = 0; i < numlist.length; i++) {
            if ((numlist[i] % n) == 0) {
                arr[cnt] = numlist[i];
                cnt++;
            }
        }
        int[] answer = new int[cnt];
        for (int i = 0; i < cnt; i++) {
            answer[i] = arr[i];
        }
        return answer;
    }

    public static void main(String[] args) {

        int n = 3;
        int[] numlist = { 4, 5, 6, 7, 8, 9, 10, 11, 12 };

        System.out.println(solution(n, numlist));

    }
}