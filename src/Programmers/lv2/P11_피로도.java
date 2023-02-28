package Programmers.lv2;

public class P11_피로도 {
    // DFS 를 위한 전역변수
    public static boolean[] visit;
    public static int answer = 0;

    public int solution(int k, int[][] dungeons) {
        // 던전 방문여부 체크하기 위해 설정
        visit = new boolean[dungeons.length];
        dfs(0, k, dungeons);

        return answer;
    }
    private void dfs(int depth, int fatigue, int[][] dungeons) {
        for (int i = 0; i < dungeons.length; i++) {
            // 이미 방문했거나 피로도 조건이 안맞을 때
            if (visit[i] || dungeons[i][0] > fatigue) {
                continue;
            }
            visit[i] = true;
            // 소모 피로도를 설정하고 재귀
            dfs(depth + 1, fatigue - dungeons[i][1], dungeons);
            visit[i] = false;
        }
        answer = Math.max(answer, depth);
    }

    public static void main(String[] args) {
        P11_피로도 q = new P11_피로도();

        int k = 80;
        int[][] dungeons = {{80,20}, {50,40}, {30,10}};
        System.out.println(q.solution(k,dungeons));
    }
}
