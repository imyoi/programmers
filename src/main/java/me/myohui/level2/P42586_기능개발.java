package me.myohui.level2;

import java.util.*;

/**
 * <p>기능개발</p>
 * https://school.programmers.co.kr/learn/courses/30/lessons/42586
 * */
public class P42586_기능개발 {
    public static void main(String[] args) {
//        int[] progresses = new int[]{93, 30, 55};
//        int[] speeds = new int[]{1, 30, 5};

        int[] progresses = new int[]{95, 90, 99, 99, 80, 99};
        int[] speeds = new int[]{1, 1, 1, 1, 1, 1};
        System.out.println(Arrays.toString(solution(progresses, speeds)));
    }

    public static int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i=0; i<progresses.length; i++) {
            int day = (int) Math.ceil((double) (100-progresses[i])/speeds[i]);
            queue.add(day);
        }

        List<Integer> resultList = new ArrayList<>();
        while (!queue.isEmpty()) {
            int leader = queue.poll();
            int count = 1;

            while (!queue.isEmpty() && queue.peek() <= leader) {
                queue.poll();
                count++;
            }
            resultList.add(count);
        }

        return resultList.stream().mapToInt(Integer::intValue).toArray();
    }
}