package Programmers.lv1;
/*
    숫자의 일부 자릿수가 영단어로 바뀌어졌거나, 혹은 바뀌지 않고 그대로인
    문자열 s가 매개변수로 주어집니다. s가 의미하는 원래 숫자를 return 하도록 solution 함수를 완성해주세요.
 */
public class P14_숫자문자열과영단어 {
    public static int solution(String s) {
        int answer = 0;
        String[] arr = {"zero","one","two","three","four","five","six","seven","eight","nine"};

        for (int i = 0; i < arr.length; i++) {                         // 0~9까지 돌면서 arr 에 해당되는 문자를 찾는다
                s = s.replaceAll((arr[i]),Integer.toString(i));        // 찾은 값은 replaceAll 을 사용하여 치환
        }
        answer = Integer.parseInt(s);

        return answer;
    }

    public static void main(String[] args) {

        String s = "one4seveneight";
        System.out.println(solution(s));
    }
}
