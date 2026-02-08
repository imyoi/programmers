package me.myohui.level0.beginner;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>[코딩테스트 입문] 모스부포(1)</p>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120838
 * */
public class P120838_모스부호_1 {
    public static void main(String[] args) {
        System.out.println(solution(".... . .-.. .-.. ---"));
    }

    public static String solution(String letter) {
        StringBuilder answer = new StringBuilder();

        Map<String, String> morseMap = new HashMap<>();
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        char alp = 'a';
        for (String m : morse) {
            morseMap.put(m, String.valueOf(alp++));
        }

        String[] letters = letter.split(" ");
        for (String l : letters) {
            answer.append(morseMap.get(l));
        }
        return answer.toString();
    }
}