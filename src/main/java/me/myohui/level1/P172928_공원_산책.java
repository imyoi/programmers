package me.myohui.level1;

import java.util.Arrays;

/**
 * <p>공원 산책</p>
 * https://school.programmers.co.kr/learn/courses/30/lessons/172928
 * */
public class P172928_공원_산책 {
    public static void main(String[] args) {
        String[] park = {"SOO","OXX","OOO"};
        String[] routes = {"E 2","S 2","W 1"};

        System.out.println(Arrays.toString(solution(park, routes)));
    }

    public static int[] solution(String[] park, String[] routes) {
        int H = park.length;
        int W = park[0].length();

        // 시작 지점(S) 찾기
        int row = 0;
        int col = 0;
        for (int i=0; i<park.length; i++) {
            if (park[i].contains("S")) {
                row = i;
                col = park[i].indexOf('S');
                break;
            }
        }

        for (String route : routes) {
            String[] s = route.split(" ");
            String direction = s[0];
            int step = Integer.parseInt(s[1]);

            // 이동 방향 설정
            int dr = 0, dc = 0;
            if ("N".equals(direction)) dr = -1;
            else if ("S".equals(direction)) dr = 1;
            else if ("W".equals(direction)) dc = -1;
            else if ("E".equals(direction)) dc = 1;

            // 현재 위치 임시 저장
            int currentRow = row;
            int currentCol = col;
            boolean isPossible = true;

            for (int i=0; i<step; i++) {
                currentRow += dr;
                currentCol += dc;

                // 공원을 벗어나거나, 장애물(X)를 만나면 이 명령은 실패
                if (currentRow < 0 || currentRow >= H
                    || currentCol < 0 || currentCol >= W
                    || park[currentRow].charAt(currentCol) == 'X') {
                    isPossible = false;
                    break;
                }
            }

            if (isPossible) {
                row = currentRow;
                col = currentCol;
            }
        }
        return new int[]{row, col};
    }
}