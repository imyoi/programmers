package me.myohui.level0.beginner;

import java.util.Arrays;

/**
 * <p>[코딩테스트 입문] 진료순서 정하기</p>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120835
 * */
public class P120835_진료순서_정하기 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{3, 76, 24})));
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4, 5, 6, 7})));
        System.out.println(Arrays.toString(solution(new int[]{30, 10, 23, 6, 100})));
    }

    public static int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        for (int i=0; i<emergency.length; i++) {
            int count = 0;
            for (int j=0; j<emergency.length; j++) {
                if (emergency[i] < emergency[j]) { // i번째 사람보다 응급도가 더 높은 사람이 있다면
                    count++;
                }
                answer[i] = count + 1; // (나보다 큰 사람 수) + 1
            }
        }
        return answer;
    }
}