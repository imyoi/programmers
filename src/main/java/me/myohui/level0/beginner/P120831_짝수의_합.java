package me.myohui.level0.beginner;

/**
 * <p>[코딩테스트 입문] 짝수의 합</p>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120831
 * */
public class P120831_짝수의_합 {
    public static void main(String[] args) {
        System.out.println(solution(10));
        System.out.println(solution(4));
    }

    public static int solution(int n) {
        int answer = 0;
        for (int i=2; i<=n; i+=2) {
            answer += i;
        }
        return answer;
    }
}