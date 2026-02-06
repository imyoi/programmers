package me.myohui.level0.pcce;

import java.util.Arrays;

/**
 * <p><b>[PCCE 기출문제] 5번 / 심폐소생술</b></p>
 *
 * 심폐소생술은 다음과 같은 순서로 실시합니다.
 * <ol>
 *   <li>심정지 및 무호흡 확인 {@code [check]}</li>
 *   <li>도움 및 119 신고 요청 {@code [call]}</li>
 *   <li>가슴압박 30회 시행 {@code [pressure]}</li>
 *   <li>인공호흡 2회 시행 {@code [respiration]}</li>
 *   <li>가슴압박, 인공호흡 반복 {@code [repeat]}</li>
 * </ol>
 *
 * 주어진 {@code solution} 함수는 심폐소생술을 하는 방법의 순서가 담긴 문자열들이
 * 무작위 순서로 담긴 리스트 {@code cpr}이 주어질 때,
 * 각각의 방법이 몇 번째 단계인지 순서대로 담아 return하는 함수입니다.
 * <p>solution 함수가 올바르게 작동하도록 빈칸을 채워 함수를 완성하세요.</p>
 */
public class P340203_심폐소생술 {
    public static void main(String[] args) {
        String[] cpr = {"call", "respiration", "repeat", "check", "pressure"};
        int[] result = solution(cpr);
        System.out.println(Arrays.toString(result));
    }

    public static int[] solution(String[] cpr) {
        int[] answer = {0, 0, 0, 0, 0};
        String[] basic_order = {"check", "call", "pressure", "respiration", "repeat"};

        for (int i=0; i<cpr.length; i++) {
            for (int j=0; j<basic_order.length; j++) {
                if(cpr[i].equals(basic_order[j])) {
                    answer[i] = j + 1; // 단계는 1부터 시작
                    break;
                }
            }
        }
        return answer;
    }
}