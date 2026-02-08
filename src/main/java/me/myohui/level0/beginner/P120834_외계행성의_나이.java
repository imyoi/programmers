package me.myohui.level0.beginner;

/**
 * <p>[코딩테스트 입문] 외계행성의 나이</p>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120834
 * */
public class P120834_외계행성의_나이 {
    public static void main(String[] args) {
        System.out.println(solution(23));
        System.out.println(solution(51));
        System.out.println(solution(100));
    }

    // 나이 age가 매개변수로 주어질 때 PROGRAMMER-962식 나이를 return
    public static String solution(int age) {
        String answer = "";
        String age962 = "abcdefghij";
        String[] tmp = String.valueOf(age).split("");
        for (String i : tmp) {
            answer += age962.charAt(Integer.valueOf(i));
        }
        return answer;
    }
}