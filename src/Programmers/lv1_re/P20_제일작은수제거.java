package Programmers.lv1_re;

import java.util.ArrayList;

/*
    정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요.
    단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요.
    예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.
 */
public class P20_제일작은수제거 {
    public int[] solution(int[] arr) {
        int[] answer = {-1};

        // arr 크기가 1일경우 -1리턴
        if (arr.length == 1) {
            return answer;
        }
        // 최소값 구하기
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        // list에 최소값 제외하고 저장하기
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != min) {
                list.add(arr[i]);
            }
        }
        // 최소값 제거한 크기만큼만 공간만들고 result에 저장
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
    public static void main(String[] args) {
        P20_제일작은수제거 q = new P20_제일작은수제거();

        int[] arr = {2, 3, 1, 4};
        System.out.println(q.solution(arr));
    }
}
