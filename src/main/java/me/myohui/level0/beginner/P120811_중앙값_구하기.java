package me.myohui.level0.beginner;

import java.util.Arrays;

/**
 * <p>[코딩테스트 입문] 중앙값 구하기</p>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120811
 * */
public class P120811_중앙값_구하기 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{9, -1, 0}));
    }

    public static int solution(int[] array) {
        Arrays.sort(array);
        return array[array.length / 2];
    }
}