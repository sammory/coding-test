package Pro;

//편지 11/14

public class P16 {

    public static int solution(String message) {
        int answer = 0;

        String[] str = message.split("");

        for (int i = 0; i < str.length*2; i++) {
            answer++;
        }
        return answer;
    }

    public static void main(String[] args) {

        String message = "happy birthday!";

        System.out.println(solution(message));

    }
}