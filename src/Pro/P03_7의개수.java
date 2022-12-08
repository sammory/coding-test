package Pro;

public class P03_7의개수 {

    // 7의 개수

    public static int solution(int[] array) {

        String num = "";

        for (int i = 0; i < array.length; i++) {
            num += array[i];
        }

        char[] strChar = num.toCharArray();
        int answer = 0;

        for (int i = 0; i < num.length(); i++) {
            if (strChar[i] == '7') {
                answer++;
            }

        }

        return answer;
    }

    public static void main(String[] args) {

        int[] array = { 7, 77, 17 };

        System.out.println(solution(array));

    }
}
