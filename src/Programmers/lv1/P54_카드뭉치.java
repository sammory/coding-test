package Programmers.lv1;
/*
    첫 번째 카드 뭉치에 순서대로 ["i", "drink", "water"], 두 번째 카드 뭉치에 순서대로 ["want", "to"]가 적혀있을 때
    ["i", "want", "to", "drink", "water"] 순서의 단어 배열을 만들려고 한다면 첫 번째 카드 뭉치에서 "i"를 사용한 후
    두 번째 카드 뭉치에서 "want"와 "to"를 사용하고 첫 번째 카드뭉치에 "drink"와 "water"를 차례대로 사용하면 원하는 순서의 단어 배열을 만들 수 있습니다.
 */
public class P54_카드뭉치 {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        // 각각의 인덱스 초기화
        int index1 = 0;
        int index2 = 0;

        for (int i = 0; i < goal.length; i++) {
            // 인덱스값이 배열의 크기보다 크면 안되고, 차례대로 goal 의 값과 비교
            if (index1 < cards1.length && cards1[index1].equals(goal[i])) {
                index1++;
            } else if (index2 < cards2.length && cards2[index2].equals(goal[i])) {
                index2++;
            } else {
                answer = "No";
                break;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        P54_카드뭉치 q = new P54_카드뭉치();

        String[] cards1 = {"i", "drink", "water"};
        String[] cards2 = {"want", "to"};
        String[] goal = {"i", "want", "to", "drink", "water"};
        System.out.println(q.solution(cards1,cards2,goal));
    }
}
