package me.myohui.level0.beginner;

import java.util.Arrays;

/**
 * <p>[코딩테스트 입문] 배열 자르기</p>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120833
 * */
public class P120833_배열_자르기 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4, 5}, 1, 3)));
        System.out.println(Arrays.toString(solution(new int[]{1, 3, 5}, 1, 2)));
    }

    public static int[] solution(int[] numbers, int num1, int num2) {
//        int[] answer = new int[num2-num1+1];
//        for (int i=num1; i<=num2; i++) {
//            answer[i-num1] = numbers[i];
//        }
//        return answer;
        return Arrays.copyOfRange(numbers, num1, num2+1);
    }
}