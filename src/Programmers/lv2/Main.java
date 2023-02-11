package Programmers.lv2;

public class Main {
    public static void main(String[] args) {
        P01_게임맵최단거리 test = new P01_게임맵최단거리();

        int[][] maps = {{1, 0, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 0, 1}, {0, 0, 0, 0, 1}};
        test.solution(maps);
        System.out.println(maps);
    }
}
