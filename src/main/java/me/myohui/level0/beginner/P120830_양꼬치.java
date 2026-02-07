package me.myohui.level0.beginner;

/**
 * <p>[코딩테스트 입문] 양꼬치</p>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120830
 * */
public class P120830_양꼬치 {
    public static void main(String[] args) {
        System.out.println(solution(10, 3));
        System.out.println(solution(64, 6));
    }

    public static int solution(int n, int k) {
        return (12000*n) + (2000*(k-n/10));
    }
}