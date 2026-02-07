package me.myohui.level0.beginner;

import java.util.Arrays;

/**
 * <p>[코딩테스트 입문] 배열 뒤집기</p>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120821
 * */
public class P120821_배열_뒤집기 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4, 5})));
        System.out.println(Arrays.toString(solution(new int[]{1, 1, 1, 1, 1, 2})));
    }

    public static int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        for (int i=0; i<num_list.length; i++) {
            answer[i] = num_list[num_list.length-i-1];
        }
        return answer;
    }
}