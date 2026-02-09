package me.myohui.level1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * <p>폰켓몬</p>
 * https://school.programmers.co.kr/learn/courses/30/lessons/1845
 * */
public class P1845_폰켓몬 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{3,1,2,3})); // 2
        System.out.println(solution(new int[]{3,3,3,2,2,4})); // 3
        System.out.println(solution(new int[]{3,3,3,2,2,2})); // 2
    }

    // N/2마리의 폰켓몬을 선택하는 방법 중, 가장 많은 종류의 폰켓몬을 선택하는 방법을 찾아, 그때의 폰켓몬 종류 번호의 개수를 return
    public static int solution(int[] nums) {
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int i : nums) {
//            map.put(i, map.getOrDefault(i, 0) + 1);
//        }
        Set<Integer> set = new HashSet<>(); // 메모리를 더 적게 사용합니다. (중복제거)
        for (int i : nums) {
            set.add(i);
        }
        return Math.min(set.size(), nums.length / 2);
    }
}