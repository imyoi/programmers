package me.myohui.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <p>같은 숫자는 싫어</p>
 * https://school.programmers.co.kr/learn/courses/30/lessons/12906
 * */
public class P12906_같은_숫자는_싫어 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1,1,3,3,0,1,1})));
    }

    public static int[] solution(int []arr) {
        List<Integer> list = new ArrayList<>();

        int lastValue = -1;
        for (int i : arr) {
            if (i != lastValue) {
                list.add(i);
                lastValue = i;
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

//    public static int[] solution(int []arr) {
//        Stack<Integer> stack = new Stack<>();
//        for (int i : arr) {
//            if (stack.isEmpty() && stack.peek() != i) {
//                stack.push(i);
//            }
//        }
//        return stack.stream().mapToInt(Integer::intValue).toArray();
//    }
}