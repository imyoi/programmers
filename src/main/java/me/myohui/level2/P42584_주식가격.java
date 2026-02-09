package me.myohui.level2;

import java.util.Arrays;
import java.util.Stack;

/**
 * <p>주식가격</p>
 * https://school.programmers.co.kr/learn/courses/30/lessons/42584
 * */
public class P42584_주식가격 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 2, 3})));
    }

    public static int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        // 시간(인덱스) 보관 스택 (대기실)
        Stack<Integer> stack = new Stack<>();

        for (int i=0; i<prices.length; i++) {
            // 대기실(스택)에 있는 애들 중, 나보다 가격이 높은 애가 있나? (하락장 발생)
            while (!stack.isEmpty() && prices[stack.peek()] > prices[i]) {
                int past = stack.pop();
                answer[past] = i - past; // 버틴시간 = 현재시간 - 과거시간
            }

            // 하락장 체크가 끝나면, 나도 일단 대기실에 들어갑니다.
            stack.push(i);
        }

        System.out.println(Arrays.toString(stack.toArray()));
        // 모든 시간을 다 훑었는데도 대기실(스택)에 남아있는 우량주들 처리
        while (!stack.isEmpty()) {
            int idx = stack.pop();
            System.out.println(idx);
            answer[idx] = (prices.length-1)-idx;
        }
        return answer;
    }
}