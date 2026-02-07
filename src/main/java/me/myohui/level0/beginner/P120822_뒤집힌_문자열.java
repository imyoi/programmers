package me.myohui.level0.beginner;

/**
 * <p>[코딩테스트 입문] 뒤집힌 문자열</p>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120822
 * */
public class P120822_뒤집힌_문자열 {
    public static void main(String[] args) {
        System.out.println(solution("jaron"));
        System.out.println(solution("bread"));
    }

    public static String solution(String my_string) {
//        String answer = "";
//        char[] arr = my_string.toCharArray();
//        for (int i=arr.length; i>0; i--) {
//            answer += arr[i-1]; // 할 때마다 새 객체 생성 + 기존 문자열 복사
//        }
//        return answer;
        return new StringBuilder(my_string).reverse().toString();
    }
}