package me.myohui.level1;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>완주하지 못한 선수</p>
 * https://school.programmers.co.kr/learn/courses/30/lessons/42576
 * */
public class P42576_완주하지_못한_선수 {
    public static void main(String[] args) {
//        String[] participant = new String[]{"leo", "kiki", "eden"};
//        String[] completion = new String[]{"eden", "kiki"};

//        String[] participant = new String[]{"marina", "josipa", "nikola", "vinko", "filipa"};
//        String[] completion = new String[]{"josipa", "filipa", "marina", "nikola"};

        String[] participant = new String[]{"mislav", "stanko", "mislav", "ana"};
        String[] completion = new String[]{"stanko", "ana", "mislav"};

        System.out.println(solution(participant, completion));
    }

    public static String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> map = new HashMap<>();

        for (String s : participant) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        for (String s : completion) {
            map.put(s, map.get(s) - 1);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 0) {
                return entry.getKey();
            }
        }
        return answer;
    }
}