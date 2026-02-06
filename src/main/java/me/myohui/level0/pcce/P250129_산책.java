package me.myohui.level0.pcce;

import java.util.Arrays;

/**
 * <p>[PCCE 기출문제] 5번 / 산책</p>
 *
 * 여름이는 강아지를 산책시키려고 합니다. 여름이는 2차원 좌표평면에서 동/서/남/북 방향으로 1m 단위로 이동하면서 강아지를 산책시킵니다.
 * 산책루트가 담긴 문자열 {@code route} 가 주어질 때, 도착점의 위치를 return 하도록 빈칸을 채워 solution 함수를 완성해 주세요.
 *
 * <p>route는 "N", "S", "E", "W"로 이루어져 있습니다.</p>
 * <ul>
 *  <li>{@code "N"}: 북쪽으로 1 이동 (y + 1)</li>
 *  <li>{@code "S"}: 남쪽으로 1 이동 (y - 1) — 북쪽으로 -1 이동과 동일</li>
 *  <li>{@code "E"}: 동쪽으로 1 이동 (x + 1)</li>
 *  <li>{@code "W"}: 서쪽으로 1 이동 (x - 1) — 동쪽으로 -1 이동과 동일</li>
 *</ul>
 *
 * 출발점으로부터 [동쪽으로 떨어진 거리, 북쪽으로 떨어진 거리]형태로 강아지의 최종 위치를 구해서 return 해야 합니다.
 */
public class P250129_산책 {
    public static void main(String[] args) {
        String route = "NSSNEWWN";
        int[] result = solution(route);
        System.out.println(Arrays.toString(result));
    }

    public static int[] solution(String route) {
        int east = 0;
        int north = 0;
        int[] answer = new int [2];
        for (int i=0; i<route.length(); i++) { // NSSNEWWN
            switch (route.charAt(i)) {
                case 'N':
                    north++;
                    break;
                case 'S':
                    north--;
                    break;
                case 'E':
                    east++;
                    break;
                case 'W':
                    east--;
                    break;
            }
        }
        answer[0] = east;
        answer[1] = north;
        return answer;
    }
}