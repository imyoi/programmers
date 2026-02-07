package me.myohui.level0.beginner;

import java.util.Arrays;

/**
 * <p>[코딩테스트 입문] 짝수 홀수 개수</p>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120824
 * */
public class P120824_짝수_홀수_개수 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4, 5})));
        System.out.println(Arrays.toString(solution(new int[]{1, 3, 5, 7})));
    }

    public static int[] solution(int[] num_list) {
        int[] answer = new int[2];
//        for (int i : num_list) {
//            if (i % 2 == 0) answer[0]++;
//            else answer[1]++;
//        }
        for (int i = 0; i < num_list.length; i++) {
            answer[num_list[i] % 2]++;
        }
        return answer;
    }
}