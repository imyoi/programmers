package me.myohui.level2;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>의상</p>
 * https://school.programmers.co.kr/learn/courses/30/lessons/42578
 * */
public class P42578_의상 {
    public static void main(String[] args) {
        String[][] clothes = {
            {"yellow_hat", "headgear"},
            {"blue_sunglasses", "eyewear"},
            {"green_turban", "headgear"}
        };
        System.out.println(solution(clothes));
    }

    public static int solution(String[][] clothes) {
        int answer = 1;
        Map<String, Integer> map = new HashMap<>();
        for (String[] s : clothes) {
            map.put(s[1], map.getOrDefault(s[1], 1) + 1);
        }

        for (String key : map.keySet()) {
            answer *= map.get(key);
        }

        return answer - 1;
    }
}