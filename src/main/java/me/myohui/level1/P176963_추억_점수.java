package me.myohui.level1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>[코딩테스트 입문] 추억 점수</p>
 * https://school.programmers.co.kr/learn/courses/30/lessons/176963
 * */
public class P176963_추억_점수 {
    public static void main(String[] args) {
//        String[] name = {"may", "kein", "kain", "radi"};
//        int[] yearning = {5, 10, 1, 3};
//        String[][] photo = {
//            {"may", "kein", "kain", "radi"},
//            {"may", "kein", "brin", "deny"},
//            {"kon", "kain", "may", "coni"}
//        };

//        String[] name = {"kali", "mari", "don"};
//        int[] yearning = {11, 1, 55};
//        String[][] photo = {
//            {"kali", "mari", "don"},
//            {"pony", "tom", "teddy"},
//            {"con", "mona", "don"}
//        };

        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5, 10, 1, 3};
        String[][] photo = {
            {"may"},
            {"kein", "deny", "may"},
            {"kon", "coni"}
        };

        System.out.println(Arrays.toString(solution(name, yearning, photo)));
    }

    public static int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        Map<String, Integer> scoreMap = new HashMap<>();
        for (int i=0; i<name.length; i++) {
            scoreMap.put(name[i], yearning[i]);
        }

        for (int i=0; i<photo.length; i++) {
            int sum = 0;
            for (String s : photo[i]) {
                if (scoreMap.containsKey(s)) {
                    sum += scoreMap.get(s);
                }
            }
            answer[i] = sum;
        }
        return answer;
    }
}