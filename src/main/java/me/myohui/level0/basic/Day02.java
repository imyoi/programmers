package me.myohui.level0.basic;

import java.util.Scanner;

/**
 * [코딩 기초 트레이닝] Day2 출력, 연산
 */
public class Day02 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
//        p181947();
//        p181946();
//        p181945();
//        p181944();
        String result = p181943("He11oWor1d", "lloWorl", 2);
        System.out.println(result);
    }

    /**
     * 덧셈식 출력하기
     * */
    public static void p181947() {
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a + " + " + b + " = " + (a + b));
    }

    /**
     * 문자열 붙여서 출력하기
     * */
    public static void p181946() {
        String a = sc.next();
        String b = sc.next();
        System.out.println(a + b);
    }

    /**
     * 문자열 돌리기
     * */
    public static void p181945() {
        String a = sc.next();
        for (int i=0; i<a.length(); i++) {
            System.out.println(a.charAt(i));
        }
    }

    /**
     * 홀짝 구분하기
     * */
    public static void p181944() {
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println(n + " is even");
        } else {
            System.out.println(n + " is odd");
        }
    }

    /**
     * 문자열 겹쳐쓰기
     * */
    public static String p181943(String my_string, String overwrite_string, int s) {
        String answer = "";
        answer = my_string.substring(0, s)
            + overwrite_string
            + my_string.substring(s + overwrite_string.length());
        return answer;
    }
}