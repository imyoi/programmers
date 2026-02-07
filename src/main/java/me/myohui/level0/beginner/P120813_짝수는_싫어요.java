package me.myohui.level0.beginner;

import java.util.Arrays;

/**
 * <p>[코딩테스트 입문] 짝수는 싫어요</p>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120813
 * */
public class P120813_짝수는_싫어요 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(10)));
    }

    public static int[] solution(int n) {
        int[] answer = new int[(n+1)/2];
        for (int i=1; i<=n; i+=2) {
            answer[i/2] = i;
        }
        return answer;
    }
}