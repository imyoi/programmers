package me.myohui.level0.beginner;

/**
 * <p>[코딩테스트 입문] 머쓱이보다 키 큰 사람</p>
 *
 * 머쓱이는 학교에서 키 순으로 줄을 설 때 몇 번째로 서야 하는지 궁금해졌습니다.
 * <p>머쓱이네 반 친구들의 키가 담긴 정수 배열 {@code array}와 머쓱이의 키 {@code height}가 매개변수로 주어질 때,</p>
 * 머쓱이보다 키 큰 사람 수를 return 하도록 solution 함수를 완성해보세요.
 * */
public class P120585_머쓱이보다_키_큰_사람 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{149, 180, 192, 170}, 167));
        System.out.println(solution(new int[]{180, 120, 140}, 190));
    }

    public static int solution(int[] array, int height) {
        int answer = 0;
        for (int i : array) {
            if (i > height) answer++;
        }

        return answer;
    }
}