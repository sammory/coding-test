package Programmers.lv1;

import java.util.HashMap;

/*
  질문마다 판단하는 지표를 담은 1차원 문자열 배열 survey 와 검사자가
  각 질문마다 선택한 선택지를 담은 1차원 정수 배열 choices 가 매개변수로 주어집니다.
  이때, 검사자의 성격 유형 검사 결과를 지표 번호 순서대로 return 하도록 solution 함수를 완성해주세요.
 */
public class P09_성격유형검사 {
    public static String solution(String[] survey, int[] choices) {
        char[] type = {'R','T','C','F','J','M','A','N'};
        //타입별로 번호 매기기
        HashMap<Character,Integer> index = new HashMap<>();
        int score[] = new int[8];
        //배열 index 순서대로 초기화
        for(int i=0; i<8; i++)
            index.put(type[i],i);

        for(int i=0; i<survey.length; i++){
            //String 값을 char 배열로 전환
            //char[0]은 앞의 알파벳, char[1]은 뒤의 알파벳
            char[] arr=survey[i].toCharArray();
            switch (choices[i]){
                case 1 : score[index.get(arr[0])]+=3;
                    break;
                case 2 : score[index.get(arr[0])]+=2;
                    break;
                case 3 : score[index.get(arr[0])]+=1;
                    break;
                case 4 : break;
                case 5 : score[index.get(arr[1])]+=1;
                    break;
                case 6 : score[index.get(arr[1])]+=2;
                    break;
                case 7 : score[index.get(arr[1])]+=3;
                    break;
                default : break;
            }
        }
        String answer = "";
        for(int i=0; i<8; i+=2){
            if(score[i]>score[i+1])
                answer+=type[i];
            else if(score[i]==score[i+1]){
                if(type[i]<type[i+1])
                    answer+=type[i];
                else
                    answer+=type[i+1];
            }
            else
                answer+=type[i+1];
        }
        return answer;
    }

    public static void main(String[] args) {

      String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
      int[] choices = {5, 3, 2, 7, 5};
      System.out.println(solution(survey,choices));
    }

}
