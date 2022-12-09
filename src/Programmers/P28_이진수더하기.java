package Programmers;

// 이진수 더하기

public class P28_이진수더하기 {
    public static String solution(String bin1, String bin2) {
        String answer = "";

        int arr1 = Integer.parseInt(bin1,2); // 문자를 이진수로 변환
        int arr2 = Integer.parseInt(bin2,2);

        answer = Long.toBinaryString(arr1 + arr2); // 더한 이진수를 문자열로 변환

        return answer;
    }


    public static void main(String[] args) {

        String bin1 = "10";
        String bin2 = "11";
        System.out.println(solution(bin1,bin2));
    }

}
