package me.myohui.level0.beginner;

import java.util.Arrays;

/**
 * <p>[코딩테스트 입문] 배열 두배 만들기</p>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120809
 * */
public class P120809_배열_두배_만들기 {
    public static void main(String[] args) {
        int[] result = solution(new int[]{1, 2, 100, -99, 1, 2, 3});
        System.out.println(Arrays.toString(result));
    }

    public static int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        for (int i=0; i <numbers.length; i++) {
            answer[i] = numbers[i] * 2;
        }
        return answer;
    }
}