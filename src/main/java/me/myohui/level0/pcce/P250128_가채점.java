package me.myohui.level0.pcce;

import java.util.Arrays;


/**
 * <p>[PCCE 기출문제] 6번 / 가채점</p>
 *
 * A반 학생들은 시험이 끝난 뒤 성적이 나오기 전 자기 시험지를 가채점해 보았습니다.
 * 이후에 선생님이 실제 성적을 불러 줄 때 가채점한 점수와 실제 성적이 다른 학생들이 있어 선생님께 문의를 하려고 합니다.
 *
 * <ul>
 *   <li>성적을 문의하려는 학생들의 번호가 담긴 정수 리스트 {@code numbers}와,</li>
 *   <li>해당 학생들이 가채점한 점수가 담긴 정수 리스트 {@code our_score},</li>
 *   <li>실제 성적이 학생 번호 순서대로 담긴 정수 리스트 {@code score_list}가 주어집니다.</li>
 * </ul>
 *
 * 주어진 solution 함수는 가채점한 점수가 실제 성적과 동일하다면 "Same"을,
 * 다르다면 "Different"를 순서대로 리스트에 담아 return하는 함수입니다.
 * solution 함수가 올바르게 작동하도록 한 줄을 수정해 주세요.
 */
public class P250128_가채점 {
    public static void main(String[] args) {
//        int[] numbers = {1};
//        int[] our_score = {100};
//        int[] score_list = {100, 80, 90, 84, 20};
        int[] numbers = {3,4};
        int[] our_score = {85,93};
        int[] score_list = {85, 92, 38, 93, 48, 85, 92, 56};
        String[] result = solution(numbers, our_score, score_list);
        System.out.println(Arrays.toString(result));
    }

    public static String[] solution(int[] numbers, int[] our_score, int[] score_list) {
        int num_student = numbers.length;
        String[] answer = new String[num_student];

        for (int i = 0; i < num_student; i++) {
            if (our_score[i] == score_list[numbers[i]-1]) {
                answer[i] = "Same";
            } else {
                answer[i] = "Different";
            }
        }

        return answer;
    }
}