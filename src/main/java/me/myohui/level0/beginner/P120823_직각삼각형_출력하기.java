package me.myohui.level0.beginner;

import java.util.Scanner;

/**
 * <p>[코딩테스트 입문] 직각삼각형 출력하기</p>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120823
 * */
public class P120823_직각삼각형_출력하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=1; i<=n; i++) {
            System.out.println("*".repeat(i));
        }
    }
}