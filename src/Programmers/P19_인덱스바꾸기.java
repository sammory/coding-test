package Programmers;

// 인덱스 바꾸기 12/6

public class P19_인덱스바꾸기 {
    public static String solution(String my_string, int num1, int num2) {
        String answer = "";
        String[] arr = my_string.split("");
        String tmp = arr[num1];

        arr[num1] = arr[num2];
        arr[num2] = tmp;
        for (String str : arr) {
            answer += str;
        }

        return answer;
    }

    public static void main(String[] args) {

        String my_string = "I l veoyou";
        int num1 = 3;
        int num2 = 6;

        System.out.println(solution(my_string, num1, num2));
    }
}
