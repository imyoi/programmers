package me.myohui.level0.beginner;

import java.util.Arrays;

/**
 * <p>[코딩테스트 입문] 분수의 덧셈</p>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120808
 * */
public class P120808_분수의_덧셈 {
    public static void main(String[] args) {
        String result = Arrays.toString(solution(1, 2, 3, 4));
        System.out.println(result);
    }

    public static int[] solution(int numer1, int denom1, int numer2, int denom2) {
        // 통분해서 더하기
        int numer = (numer1 * denom2) + (numer2 * denom1);
        int denom = denom1 * denom2;

        // 최대공약수로 약분
        int a = numer;
        int b = denom;
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        int gcd = a;

        // 기약분수로 반환
        return new int[]{numer/gcd, denom/gcd};
    }

    public int gcd(int num1, int num2) {
        if (num1 % num2 == 0)
            return num2;
        return gcd(num2, num1 % num2);
    }
}