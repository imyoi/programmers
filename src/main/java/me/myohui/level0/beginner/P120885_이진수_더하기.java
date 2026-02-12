package me.myohui.level0.beginner;

/**
 * <p>[코딩테스트 입문] 이진수 더하기</p>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120885
 * */
public class P120885_이진수_더하기 {
    public static void main(String[] args) {
        System.out.println(solution("10", "11")); // "101"
    }

    public static String solution(String bin1, String bin2) {
        int num1 = Integer.parseInt(bin1, 2);
        int num2 = Integer.parseInt(bin2, 2);
        return Integer.toBinaryString(num1 + num2);
    }
}