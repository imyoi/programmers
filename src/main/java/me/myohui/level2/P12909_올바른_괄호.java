package me.myohui.level2;

import java.util.Stack;

/**
 * <p>올바른 괄호</p>
 * https://school.programmers.co.kr/learn/courses/30/lessons/12909
 * */
public class P12909_올바른_괄호 {
    public static void main(String[] args) {
        System.out.println(solution("(())()"));
        System.out.println(solution(")()("));
    }

    public static boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}