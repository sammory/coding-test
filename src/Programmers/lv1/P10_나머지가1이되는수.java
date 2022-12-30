package Programmers.lv1;
/*
    자연수 n이 매개변수로 주어집니다. n을 x로 나눈 나머지가 1이 되도록
    하는 가장 작은 자연수 x를 return 하도록 solution 함수를 완성해주세요.
    답이 항상 존재함은 증명될 수 있습니다.
 */
public class P10_나머지가1이되는수 {
    public static int solution(int n) {
        int answer = 0;

        for (int i = 2; i < n; i++) {  // 가장 작은 자연수를 리턴해야하므로 2부터 시작
            if (n % i == 1) {
                answer = i;           // 나머지를 찾아 추가 후 break 로 반복문 빠져너옴
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        int n = 10;
        System.out.println(solution(n));
    }
}
