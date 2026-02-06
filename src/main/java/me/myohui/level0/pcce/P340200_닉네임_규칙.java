package me.myohui.level0.pcce;

/**
 * <p>[PCCE 기출문제] 8번 / 닉네임 규칙</p>
 *
 * 온라인 서비스를 이용하기 위해 닉네임이 필요합니다. 닉네임이 될 수 있는 조건은 다음과 같습니다.
 * <ul>
 *   <li>닉네임 길이: 4자 이상 8자 이하</li>
 *   <li>닉네임에 소문자 {@code l}, {@code w}, 대문자 {@code O}, {@code W}는 사용할 수 없음</li>
 *   <li>이외의 영어 대소문자와 숫자는 모두 사용 가능</li>
 * </ul>
 *
 * 주어진 {@code solution} 함수는 사용할 수 없는 닉네임 {@code nickname}을 받아
 * 사용할 수 있는 닉네임으로 바꿔 반환하는 함수입니다.
 * 닉네임 변경 규칙은 아래를 1번부터 순서대로 적용합니다.
 *
 * <ol>
 *   <li>소문자 {@code l}을 대문자 {@code I}로 변경</li>
 *   <li>소문자 {@code w}를 {@code vv}로 변경</li>
 *   <li>대문자 {@code W}를 {@code VV}로 변경</li>
 *   <li>대문자 {@code O}를 숫자 {@code 0}으로 변경</li>
 *   <li>수정된 닉네임 길이가 4 미만이면, 뒤에 소문자 {@code o}를 길이가 4가 될 때까지 덧붙임</li>
 *   <li>수정된 닉네임 길이가 8보다 크면, 8번째 문자까지만 사용</li>
 * </ol>
 *
 * 주어진 {@code solution} 함수에는 위 규칙 중 일부가 올바르게 적용되지 않는 부분이 있습니다.
 * {@code solution} 함수가 올바르게 동작하도록 한 줄을 수정하세요.
 */
public class P340200_닉네임_규칙 {

    public static void main(String[] args) {
//        String nickname = "WORLDworld";
        String nickname = "GO";

        String result = solution(nickname);
        System.out.println(result);
    }

    public static String solution(String nickname) {
        String answer = "";
        for (int i=0; i<nickname.length(); i++) {
            if(nickname.charAt(i) == 'l') {
                answer += "I";
            } else if(nickname.charAt(i) == 'w') {
                answer += "vv";
            } else if(nickname.charAt(i) == 'W') {
                answer += "VV";
            } else if(nickname.charAt(i) == 'O') {
                answer += "0";
            } else {
                answer += nickname.charAt(i);
            }
        }
        while (answer.length() < 4) {
            answer += "o";
        }
        if (answer.length() > 8) {
            answer = answer.substring(0, 8);
        }
        return answer;
    }
}