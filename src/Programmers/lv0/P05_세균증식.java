package Programmers.lv0;

//세균증식 11/8

public class P05_세균증식 {

    public static int solution(int n, int t) {
        int answer = (int) Math.pow(2, t)*n;

        return answer;

    }

    //for(int i = 0; i < t; i++) {
    //n *=2;
    //}



    public static void main(String[] args) {

        int n = 2;
        int t = 4;

        System.out.println(solution(n,t));

    }
}
