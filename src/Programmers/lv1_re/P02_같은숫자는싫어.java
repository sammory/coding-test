package Programmers.lv1_re;

import java.util.ArrayList;

/*
    배열 arr가 주어집니다. 배열 arr의 각 원소는 숫자 0부터 9까지로 이루어져 있습니다.
    이때, 배열 arr에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거하려고 합니다.
    단, 제거된 후 남은 수들을 반환할 때는 배열 arr의 원소들의 순서를 유지해야 합니다
 */
public class P02_같은숫자는싫어 {
    public int[] solution(int []arr) {
        int[] answer = {};
        ArrayList<Integer> arrList = new ArrayList<Integer>();

        int num = -1; //원소가 0~9까지 이므로 영향 안받는 아무 숫자.
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != num){
                arrList.add(arr[i]);
                num = arr[i];
            }
        }

        answer = new int[arrList.size()]; //answer 리스트 크기 선언.
        for(int i = 0; i < answer.length; i++){
            answer[i] = arrList.get(i);
        }

        return answer;
    }
    public static void main(String[] args) {
        P02_같은숫자는싫어 q = new P02_같은숫자는싫어();

        int[] arr = {1,1,3,3,0,1,1};
        System.out.println(q.solution(arr));
    }
}
