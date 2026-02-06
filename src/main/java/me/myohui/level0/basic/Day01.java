package me.myohui.level0.basic;

import java.util.Scanner;


/**
 * [코딩 기초 트레이닝] Day1 출력
 */
public class Day01 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
//        p181952();
//        p181951();
//        p181950();
//        p181949();
        p181948();
    }

    /**
     * 문자열 출력하기
     * */
    public static void p181952() {
        String str = sc.next();
        System.out.println(str);
    }

    /**
     * a와 b 출력하기
     * */
    public static void p181951() {
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    /**
     * 문자열 반복해서 출력하기
     * */
    public static void p181950() {
        String str = sc.next();
        int n = sc.nextInt();
        System.out.println(str.repeat(n));
    }

    /**
     * 대소문자 바꿔서 출력하기
     * */
    public static void p181949() {
        String a = sc.next(); // aBcDeFg
        for (char c : a.toCharArray()) {
            if (Character.isUpperCase(c)) {
                System.out.print(Character.toLowerCase(c));
            } else {
                System.out.print(Character.toUpperCase(c));
            }
        }
    }

    /**
     * 특수문자 출력하기
     */
    public static void p181948() {
        System.out.println("!@#$%^&*(\\'\"<>?:;");
    }
}