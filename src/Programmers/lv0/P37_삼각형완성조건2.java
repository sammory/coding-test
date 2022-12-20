package Programmers.lv0;


/*
    선분 세 개로 삼각형을 만들기 위해서는 다음과 같은 조건을 만족해야 합니다.

    가장 긴 변의 길이는 다른 두 변의 길이의 합보다 작아야 합니다.
    삼각형의 두 변의 길이가 담긴 배열 sides이 매개변수로 주어집니다.
    나머지 한 변이 될 수 있는 정수의 개수를 return하도록 solution 함수를 완성해주세요.
 */
public class P37_삼각형완성조건2 {
    public static int solution(int[] sides) {
        int min=Math.min(sides[0], sides[1]);
        int max=Math.max(sides[0], sides[1]);
        int sum=sides[0]+sides[1];
        int answer = 0;

        for(int i = 1; i < sum; i++) {
            if(i <= min || i < max){   //i가 중간값 또는 최솟값
                if(max < min + i) {
                    answer++;
                }
            }else if(i >= max) {//i가 가장 긴 변이면
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        int[] sides = {11,7};
        System.out.println(solution(sides));
    }

}
