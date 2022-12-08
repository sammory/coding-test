package Programmers;

//OX 퀴즈

public class P08_OX퀴즈 {

    public static String[] solution(String[] quiz) {

        String[] answer = new String[quiz.length];

        for (int i = 0; i < quiz.length; i++) {
            String[] text = quiz[i].split(" ");

            if (text[1].equals("+") ) {
                int result = Integer.parseInt(text[0]) + Integer.parseInt(text[2]);
                answer[i] = result == Integer.parseInt(text[4]) ? "O" : "X";

            } else if (text[1].equals("-")) {
                int result = Integer.parseInt(text[0]) - Integer.parseInt(text[2]);
                answer[i] = result == Integer.parseInt(text[4]) ? "O" : "X";
            }

        }
        return answer;

    }

    public static void main(String[] args) {

        String[] quiz = { "3 - 4 = -3", "5 + 6 = 11" };

        System.out.println(solution(quiz));

    }
}
