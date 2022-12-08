package Programmers;

//배열의 유사도

public class P12_배열유사도 {

    public static int solution(String[] s1, String[] s2) {
        int answer = 0;

//        for(String s : s1) {
//        	for(String t : s2)
//        		if(s.equals(t)) {
//        			answer++;
//        		}
//        }

        for (int i = 0; i < s1.length; i++) {
            for (int j = 0; j < s2.length; j++) {
                if(s1[i].equals(s2[j])) {
                    answer++;
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        String[] s1 = {"a", "b", "c"};
        String[] s2 = {"com", "b", "d", "p", "c"};

        System.out.println(solution(s1, s2));

    }
}