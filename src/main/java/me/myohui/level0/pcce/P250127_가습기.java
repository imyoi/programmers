package me.myohui.level0.pcce;

/**
 * <p>[PCCE 기출문제] 7번 / 가습기</p>
 *
 * 상우가 사용하는 가습기에는 "auto", "target", "minimum"의 세 가지 모드가 있습니다.
 * 가습기의 가습량은 0~5단계로 구분되며 각 모드 별 동작 방식은 다음과 같습니다.
 *
 *  <p>"auto" 모드</p>
 *  <ul>
 *    <li>0 이상 10 미만: 5단계</li>
 *    <li>10 이상 20 미만: 4단계</li>
 *    <li>20 이상 30 미만: 3단계</li>
 *    <li>30 이상 40 미만: 2단계</li>
 *    <li>40 이상 50 미만: 1단계</li>
 *    <li>50 이상: 0단계</li>
 *  </ul>
 *
 *  <p>"target" 모드</p>
 *  <ul>
 *    <li>습도가 설정값 미만: 3단계</li>
 *    <li>습도가 설정값 이상: 1단계</li>
 *  </ul>
 *
 *  <p>"minimum" 모드</p>
 *  <ul>
 *    <li>습도가 설정값 미만: 1단계</li>
 *    <li>습도가 설정값 이상: 0단계</li>
 *  </ul>
 *
 * <ul>
 *   <li>상우가 설정한 가습기의 모드를 나타낸 문자열 {@code mode_type}</li>
 *   <li>현재 공기 중 습도를 나타낸 정수 {@code humidity},</li>
 *   <li>설정값을 나타낸 정수 {@code val_set} 이 주어질 때</li>
 * </ul>
 *
 * 현재 가습기가 몇 단계로 작동 중인지 return하도록 빈칸을 채워 solution 함수를 완성해 주세요.
 */
public class P250127_가습기 {
    public static void main(String[] args) {
        String mode_type = "auto";
        int humidity = 23;
        int val_set = 45;

        int result = solution(mode_type, humidity, val_set);
        System.out.println(result);
    }

    /**
     * target 모드 가습 단계 반환
     *
     * @param humidity 현재 습도
     * @param val_set 목표 습도 설정값
     * @return target 모드 가습 단계(1 또는 3)
     */
    public static int func1(int humidity, int val_set) {
        if (humidity < val_set)
            return 3;
        return 1;
    }

    /**
     * auto 모드 가습 단계 반환
     *
     * @param humidity 현재 습도
     * @return auto 모드 가습 단계(0~5)
     */
    public static int func2(int humidity) {
        if (humidity >= 50)
            return 0;
        else if (humidity >= 40)
            return 1;
        else if (humidity >= 30)
            return 2;
        else if (humidity >= 20)
            return 3;
        else if (humidity >= 10)
            return 4;
        else
            return 5;
    }

    /**
     * minimum 모드 가습 단계 반환

     * @param humidity 현재 습도
     * @param val_set 최소 유지 기준 설정값
     * @return minimum 모드 가습 단계(0 또는 1)
     */
    public static int func3(int humidity, int val_set) {
        if (humidity < val_set)
            return 1;
        return 0;
    }

    /**
     * 가습기 모드에 따라 가습 단계 반환
     *
     * @param mode_type 가습기 모드 타입 ("auto", "target", "minimum")
     * @param humidity 현재 습도
     * @param val_set 설정값(목표/최소 기준)
     * @return 현재 가습 단계
     */
    public static int solution(String mode_type, int humidity, int val_set) {
        int answer = 0;

        if (mode_type.equals("auto")) {
            answer = func2(humidity);
        }
        else if (mode_type.equals("target")) {
            answer = func1(humidity, val_set);
        }
        else if (mode_type.equals("minimum")) {
            answer = func3(humidity, val_set);
        }

        return answer;
    }
}