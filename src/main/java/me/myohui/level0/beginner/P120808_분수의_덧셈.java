package me.myohui.level0.beginner;

import java.util.Arrays;

/**
 * <p>[코딩테스트 입문] 분수의 덧셈</p>
 *
 * <p> 첫 번째 분수의 분자와 분모를 뜻하는 {@code numer1}, {@code denom1},
 * 두 번째 분수의 분자와 분모를 뜻하는 {@code numer2}, {@code denom2}가 매개변수로 주어집니다.</p>
 * 두 분수를 더한 값을 기약 분수로 나타냈을 때 분자와 분모를 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.
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