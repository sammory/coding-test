package Programmers.lv1_re;

public class P31_비밀지도 {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] result = new String[n];

        for (int i = 0; i < n; i++) {
            // arr1[i]과 arr1[i] 각각의 정수를 이진수 비트연산을 하여 int형 정수로 저장
            int combinedMap = arr1[i] | arr2[i];

            // combinedMap의 정수를 이진수로 변환하여 저장
            result[i] = Integer.toBinaryString(combinedMap);

            // 비밀지도의 길이가 n보다 작을 경우, 앞에 0을 채워줌
            while (result[i].length() < n) {
                result[i] = "0" + result[i];
            }

            // 비밀지도에서 1은 벽("#")으로, 0은 공백(" ")으로 변환
            result[i] = result[i].replace("1", "#");
            result[i] = result[i].replace("0", " ");
        }
        return result;
    }
    public static void main(String[] args) {
        P31_비밀지도 q = new P31_비밀지도();

        int budget = 5;
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};
        System.out.println(q.solution(budget, arr1, arr2));
    }
}
