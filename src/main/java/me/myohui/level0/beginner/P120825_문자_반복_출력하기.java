package me.myohui.level0.beginner;

/**
 * <p>[코딩테스트 입문] 문자 반복 출력하기</p>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120825
 * */
public class P120825_문자_반복_출력하기 {
    public static void main(String[] args) {
        System.out.println(solution("hello", 3));
    }

    public static String solution(String my_string, int n) {
        StringBuilder answer = new StringBuilder();
        for (char c : my_string.toCharArray()) {
            answer.append(String.valueOf(c).repeat(n));
        }
        return answer.toString();
    }
}