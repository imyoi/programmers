package me.myohui.level0.beginner;

/**
 * <p>[코딩테스트 입문] 피자 나눠 먹기</p>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120814
 * https://school.programmers.co.kr/learn/courses/30/lessons/120815
 * https://school.programmers.co.kr/learn/courses/30/lessons/120816
 * */
public class P12081X_피자_나눠_먹기 {
    public static void main(String[] args) {
//        System.out.println(solution1(7));
//        System.out.println(solution1(1));
//        System.out.println(solution1(15));

//        System.out.println(solution2(6));
//        System.out.println(solution2(10));
//        System.out.println(solution2(4));

        System.out.println(solution3(7, 10));
        System.out.println(solution3(4, 12));
    }

    /**
     * 피자 나눠 먹기 (1)
     * 모든 사람이 피자를 한 조각 이상 먹기 위해 필요한 피자의 수
     * */
    public static int solution1(int n) {
        return (n%7==0) ? n/7 : n/7+1;
    }

    /**
     * 피자 나눠 먹기 (2)
     * n명이 주문한 피자를 남기지 않고 모두 같은 수의 피자 조각을 먹어야 한다면 최소 몇 판을 시켜야 하는지
     * */
    public static int solution2(int n) {
        int answer = 1;
        while (6 * answer % n != 0) {
            answer++;
        }
        return answer;
    }

    /**
     * 피자 나눠 먹기 (3)
     * n명의 사람이 최소 한 조각 이상 피자를 먹으려면 최소 몇 판의 피자를 시켜야 하는지
     * */
    public static int solution3(int slice, int n) {
        return (n%slice != 0) ? (n/slice + 1) : n/slice;
    }
}