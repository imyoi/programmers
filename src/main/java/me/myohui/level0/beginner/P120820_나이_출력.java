package me.myohui.level0.beginner;

/**
 * <p>[코딩테스트 입문] 나이 출력</p>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120820
 * */
public class P120820_나이_출력 {
    public static void main(String[] args) {
        System.out.println(solution(40));
        System.out.println(solution(23));
    }

    public static int solution(int age) {
        return Math.abs(2022 - age + 1);
    }
}