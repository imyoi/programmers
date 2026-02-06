package me.myohui.level0.pcce;

import java.util.Scanner;

/**
 * <p>[PCCE 기출문제] 2번 / 피타고라스의 정리</p>
 *
 * <p>직각삼각형이 주어졌을 때 빗변의 제곱은 다른 두 변을 각각 제곱한 것의 합과 같습니다.({@code a^2 + b^2 = c^2})</p>
 * 직각삼각형의 한 변의 길이를 나타내는 정수 a와 빗변의 길이를 나타내는 정수 c가 주어질 때,
 * 다른 한 변의 길이의 제곱, b_square 을 출력하도록 한 줄을 수정해 코드를 완성해 주세요.
 * */
public class P250132_피타고라스의_정리 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // 3
        int c = sc.nextInt(); // 5

        int b_square = c*c - a*a; // 16

        System.out.println(b_square);
    }
}