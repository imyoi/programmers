package me.myohui.level2;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * <p>프로세스</p>
 * https://school.programmers.co.kr/learn/courses/30/lessons/42587
 * */
public class P42587_프로세스 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{2, 1, 3, 2}, 2));
        System.out.println(solution(new int[]{1, 1, 9, 1, 1, 1}, 0));
    }

    public static int solution(int[] priorities, int location) {
        int answer = 0;

        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for (int i : priorities) {
            queue.add(i);
        }

        while (!queue.isEmpty()) {
            for (int i=0; i<priorities.length; i++) {
                if (!queue.isEmpty() && priorities[i] == queue.peek()) {
                    queue.poll();
                    answer++;

                    if (i == location) return answer;
                }
            }
        }
        return answer;
    }
}