package Pro;

//제곱수 판별하기

public class P06 {

    public static int solution(int n) {
        int a = (int) Math.sqrt(n);
        int answer = (a == Math.sqrt(n)) ? 1 : -1;

        return answer;

    }

    public static void main(String[] args) {

        int n = 16;

        System.out.println(solution(n));

    }
}
