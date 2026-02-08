package me.myohui.level0.beginner;

/**
 * <p>[코딩테스트 입문] 개미 군단</p>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120837
 * */
public class P120837_개미_군단 {
    public static void main(String[] args) {
        System.out.println(solution(23));
        System.out.println(solution(24));
        System.out.println(solution(999));
    }

    public static int solution(int hp) {
        return (hp/5) + ((hp%5)/3) + ((hp%5)%3);
    }
}