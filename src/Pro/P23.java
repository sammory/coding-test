package Pro;

// 369 게임

public class P23 {
    public static int solution(int order) {
        int answer = 0;
        String str = Integer.toString(order);
        String[] sb = str.split("");

        for (int i = 0; i < sb.length; i++) {
            if (Integer.parseInt(sb[i]) % 3 == 0 && Integer.parseInt(sb[i]) != 0) {
                answer ++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        int order = 29423;
        System.out.println(solution(order));
    }
}
