package Programmers.lv1_re;
/*
    자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
*/
public class P17_자리수뒤집어배열 {
    public int[] solution(long n) {
        // 숫자열의 길이
        int[] answer = new int[(int)(Math.log10(n) + 1)];

        long num = 0;
        int cnt = 0;
        while (n >= 1) {  // 1의자리 수까지 반복
            num = n % 10; // 10으로 나눈 나머지를 저장
            n /= 10;
            answer[cnt] = (int)num; // answer의 cnt번째에 저장
            cnt++; // cnt를 올려줌으로 다음칸에 저장될 준비
        }

        return answer;
    }
    public static void main(String[] args) {
        P17_자리수뒤집어배열 q = new P17_자리수뒤집어배열();

        int n = 12345;
        System.out.println(q.solution(n));
    }
}
