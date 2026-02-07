package me.myohui.level0.beginner;

import java.util.Arrays;

/**
 * <p>[코딩테스트 입문] 배열의 평균값</p>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120817
 * */
public class P120817_배열의_평균값 {
    public static void main(String[] args) {
        double result1 = solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        double result2 = solution(new int[]{89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99});
        System.out.println(result1);
        System.out.println(result2);
    }

    public static double solution(int[] numbers) {
//        double answer = 0;
//        for (int i : numbers) {
//            answer += i;
//        }
//        return answer / numbers.length;
        return Arrays.stream(numbers).average().orElse(0);
    }
}