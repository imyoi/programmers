package me.myohui.level0.beginner;

import java.util.Arrays;

/**
 * <p>[코딩테스트 입문] 최빈값 구하기</p>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120813
 * */
public class P120813_최빈값_구하기 {
    public static void main(String[] args) {
//        System.out.println(solution(new int[]{1, 2, 3, 3, 3, 4}));
//        System.out.println(solution(new int[]{1, 1, 2, 2}));
        System.out.println(solution(new int[]{1}));
    }

    public static int solution(int[] array) {
        Arrays.sort(array);
        int max = array[array.length-1]; // 배열 원소 중 최대값
        int[] count = new int[max+1];
        for (int i : array) {
            count[i]++;
        }

        int maxNum = 0;
        int maxCount = 0;
        for (int i=0; i<count.length; i++) {
            if (maxCount <= count[i]) {
                maxNum = i;
                maxCount = count[i];
            }
        }

        int finalMaxCount = maxCount;
        long temp = Arrays.stream(count)
            .filter(n -> n == finalMaxCount).count();

        return (temp > 1) ? -1 : maxNum; // 최빈값이 여러개면 -1 리턴
    }
}