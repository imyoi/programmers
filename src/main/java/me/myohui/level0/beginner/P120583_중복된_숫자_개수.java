package me.myohui.level0.beginner;

/**
 * <p>[코딩테스트 입문] 중복된 숫자 개수</p>
 *
 * 정수가 담긴 배열 {@code array}와 정수 {@code n}이 매개변수로 주어질 때,
 * array에 n이 몇 개 있는 지를 return 하도록 solution 함수를 완성해보세요.
 * */
public class P120583_중복된_숫자_개수 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 1, 2, 3, 4, 5}, 1));
        System.out.println(solution(new int[]{0, 2, 3, 4}, 1));
    }

    public static int solution(int[] array, int n) {
        int answer = 0;
        for (int i : array) {
            if (i == n) answer++;
        }
        return answer;
    }
}