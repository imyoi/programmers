package me.myohui.level0.beginner;

/**
 * <p>[코딩테스트 입문] 특정 문자 제거하기</p>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120826
 * */
public class P120826_특정_문자_제거하기 {
    public static void main(String[] args) {
        System.out.println(solution("abcdef", "f"));
        System.out.println(solution("BCBdbe", "B"));
    }

    public static String solution(String my_string, String letter) {
        return my_string.replaceAll(letter, "");
    }
}