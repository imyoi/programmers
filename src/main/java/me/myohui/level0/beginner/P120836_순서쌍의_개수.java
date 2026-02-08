package me.myohui.level0.beginner;

/**
 * <p>[코딩테스트 입문] 순서쌍의 개수</p>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120836
 * */
public class P120836_순서쌍의_개수 {
    public static void main(String[] args) {
        System.out.println(solution(20));
        System.out.println(solution(100));
    }

    public static int solution(int n) {
        int answer = 0;
        for (int i=1; i<=n; i++) {
            if (n % i == 0) answer++;
        }
        return answer;
    }
}