package me.myohui.level0.beginner;

/**
 * <p>[코딩테스트 입문] 각도기</p>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120829
 * */
public class P120829_각도기 {
    public static void main(String[] args) {
        System.out.println(solution(70));
        System.out.println(solution(91));
        System.out.println(solution(180));
    }

    public static int solution(int angle) {
        if (0 < angle && angle < 90) return 1;
        else if (angle == 90) return 2;
        else if (90 < angle && angle < 180) return 3;
        return 4;
    }
}