package me.myohui.level0.beginner;

import java.util.Arrays;

/**
 * <p>[코딩테스트 입문] 아이스 아메리카노</p>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120819
 * */
public class P120819_아이스_아메리카노 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(5500)));
        System.out.println(Arrays.toString(solution(15000)));
    }

    public static int[] solution(int money) {
        return new int[]{money/5500, money%5500};
    }
}