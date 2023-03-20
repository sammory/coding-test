package Programmers.lv2;
/*
    한자리 숫자가 적힌 종이 조각이 흩어져있습니다. 흩어진 종이 조각을 붙여 소수를 몇 개 만들 수 있는지 알아내려 합니다.
    각 종이 조각에 적힌 숫자가 적힌 문자열 numbers가 주어졌을 때,
    종이 조각으로 만들 수 있는 소수가 몇 개인지 return 하도록 solution 함수를 완성해주세요.
 */
import java.util.ArrayList;

public class P20_소수찾기 {
    static ArrayList<Integer> arr = new ArrayList<>();
    static boolean[] check = new boolean[7];

    public int solution(String numbers) {
        int answer = 0;
        for(int i = 0; i < numbers.length(); i++){
            dfs(numbers,"",i + 1);
        }

        for(int i=0; i<arr.size(); i++){
            if(prime(arr.get(i))) answer++;
        }

        return answer;

    }
    //백트래킹
    static void dfs(String str, String temp, int m) {
        if(temp.length() == m){
            int num = Integer.parseInt(temp);
            if(!arr.contains(num)){
                arr.add(num);
            }
        }

        for(int i = 0; i < str.length(); i++){
            if(!check[i]){
                check[i] = true;
                temp += str.charAt(i);
                dfs(str, temp, m);
                check[i] = false;
                temp = temp.substring(0, temp.length() - 1);
            }
        }
    }
    //소수 판단
    static boolean prime(int n) {
        if(n < 2) return false;

        for(int i = 2; i * i <= n; i++) {
            if(n % i == 0) return false;
        }

        return true;
    }
    public static void main(String[] args) {
        P20_소수찾기 q = new P20_소수찾기();

        String numbers = "17";
        System.out.println(q.solution(numbers));
    }
}
