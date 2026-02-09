package me.myohui.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <p>[완전탐색] 모의고사</p>
 * https://school.programmers.co.kr/learn/courses/30/lessons/42840
 * */
public class P42840_모의고사 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1,2,3,4,5})));
        System.out.println(Arrays.toString(solution(new int[]{1,3,2,4,2})));
    }

    public static int[] solution(int[] answers) {
        int[] person1 = {1, 2, 3, 4, 5};
        int[] person2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] person3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] scores = new int[3];
        for (int i=0; i<answers.length; i++) {
            if (answers[i] == person1[i % person1.length]) scores[0]++;
            if (answers[i] == person2[i % person2.length]) scores[1]++;
            if (answers[i] == person3[i % person3.length]) scores[2]++;
        }

        int maxScore = Math.max(scores[0], Math.max(scores[1], scores[2]));

        List<Integer> list = new ArrayList<>();
        if (scores[0] == maxScore) list.add(1);
        if (scores[1] == maxScore) list.add(2);
        if (scores[2] == maxScore) list.add(3);

        return list.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}