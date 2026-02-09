package me.myohui.level2;

import java.util.Arrays;

/**
 * <p>카펫</p>
 * https://school.programmers.co.kr/learn/courses/30/lessons/42842
 * */
public class P42842_카펫 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(10, 2)));
        System.out.println(Arrays.toString(solution(8, 1)));
        System.out.println(Arrays.toString(solution(24, 24)));
    }

    public static int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int total = brown + yellow;

        for (int h=3; h<=Math.sqrt(total); h++) {
            if (total % h == 0) {
                int w = total / h;

                if ((w-2)*(h-2)==yellow) {
                    answer[0] = w;
                    answer[1] = h;
                    break;
                }
            }
        }
        return answer;
    }
}