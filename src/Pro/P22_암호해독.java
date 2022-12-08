package Pro;

// 암호해독 12/7

public class P22_암호해독 {
    public static String solution(String cipher, int code) {
        String answer = "";
        String[] arr = cipher.split("");

        for (int i = 0; i <= arr.length; i++) {
            if (i % code == 0 && i != 0) {
                answer += arr[i-1];
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        String cipher = "dfjardstddetckdaccccdegk";
        int code = 4;
        System.out.println(solution(cipher, code));
    }
}
