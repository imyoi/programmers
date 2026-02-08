package me.myohui.level0.beginner;

/**
 * <p>[코딩테스트 입문] 가위 바위 보</p>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120839
 * */
public class P120839_가위_바위_보 {
    public static void main(String[] args) {
        System.out.println(solution("2"));
        System.out.println(solution("205"));
    }

    public static String solution(String rsp) {
        StringBuilder answer = new StringBuilder();
        String[] rspArr = rsp.split("");
        for (String s : rspArr) {
            if ("2".equals(s)) answer.append("0");
            else if ("0".equals(s)) answer.append("5");
            else answer.append("2");
        }
        return answer.toString();
    }
}