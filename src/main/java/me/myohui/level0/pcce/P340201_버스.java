package me.myohui.level0.pcce;

/**
 * <p><b>[PCCE 기출문제] 7번 / 버스</b></p>
 *
 * 영진이는 약속 장소에 가기 위해 버스를 타려고 합니다. 버스에는 좌석이 총 {@code seat}개만큼 있습니다.
 * 기점에서 출발한 버스가 영진이가 기다리는 정거장에 도착하기 전에 방문하는 각 정거장에서 승/하차한 승객 정보가 주어질 때,
 * 영진이가 버스에 탄 순간 빈 좌석은 몇 개인지 구해주세요.
 *
 * <ul>
 *   <li>영진이가 기다리는 정거장에서는 영진이가 가장 먼저 탑승합니다.</li>
 *   <li>이전 정거장에서 탑승한 승객들은 남는 좌석이 있다면 항상 앉는다고 가정합니다.</li>
 *   <li>기점에서 출발하는 버스에는 승객이 0명입니다.</li>
 * </ul>
 *
 * 예를 들어 다음은 좌석이 5개인 버스에서 각 정거장에서 승/하차한 승객 정보를 나타냅니다.
 * 영진이는 4번 정거장에서 기다리고 있으며, "On"은 승차한 승객, "Off"는 하차한 승객을 의미합니다.
 * ("-"는 배열의 가로(열) 길이를 맞추기 위한 요소로, 아무런 의미도 없습니다.)
 *
 * <ul>
 *   <li>1번 정거장: {@code ["On", "On", "On"]} (3명 승차)</li>
 *   <li>2번 정거장: {@code ["Off", "On", "-"]} (1명 하차, 1명 승차)</li>
 *   <li>3번 정거장: {@code ["Off", "-", "-"]} (1명 하차)</li>
 * </ul>
 *
 * <p>
 * 위와 같은 경우, 1번 정거장에서 3명이 승차하고, 2번 정거장에서 1명 승차 1명 하차, 3번 정거장에서 1명이 하차했으므로
 * 4번 정거장(영진이가 기다리는 정거장)에 도착한 버스에는 2명이 타고 있습니다..
 * 4번 정거장에서는 영진이가 가장 먼저 탑승하므로, 남아있는 좌석 수는 {@code 5 - 2 = 3} 입니다.
 * </p>
 * 주어진 {@code solution} 함수는 버스의 좌석 개수 {@code seat},
 * 기점에서 출발한 버스가 순서대로 방문한 정거장에서 승객이 승/하차한 정보를 담은 2차원 문자열 리스트 {@code passengers} 가 주어질 때,
 * 버스에 남아있는 좌석의 개수를 return 하는 함수입니다.
 */
public class P340201_버스 {

    public static void main(String[] args) {
        // result = 3
//        int seat = 5;
//        String[][] passengers = {
//            {"On", "On", "On"},
//            {"Off", "On", "-"},
//            {"Off", "-", "-"}
//        };

        // result = 0
        int seat = 10;
        String[][] passengers = {
            {"On", "On", "On", "On", "On", "On", "On", "On", "-", "-"},
            {"On", "On", "Off", "Off", "Off", "On", "On", "-", "-", "-"},
            {"On", "On", "On", "Off", "On", "On", "On", "Off", "Off", "Off"},
            {"On", "On", "Off", "-", "-", "-", "-", "-", "-", "-"}
        };
        int result = solution(seat, passengers);
        System.out.println(result);
    }

    public static int solution(int seat, String[][] passengers) {
        int num_passenger = 0; // 현재 타고 있는 승객 수
        for (int i=0; i<passengers.length; i++) {
            num_passenger += func4(passengers[i]); // 승차(On)한 승객 수 누적
            num_passenger -= func3(passengers[i]); // 하차(Off)한 승객 수 차감
        }

        // 남은 좌석 수 계산 (0 미만이면 0으로 처리)
        int result = func1(seat-num_passenger);
        return result;
    }

    /**
     * 좌석 수가 음수가 되지 않도록 보정하는 함수
     * 음수이면 0을 반환하고, 양수이면 그대로 반환
     */
    public static int func1(int num) {
        if (0 > num) {
            return 0;
        } else {
            return num;
        }
    }

    public int func2(int num) {
        if (num > 0) {
            return 0;
        } else {
            return num;
        }
    }

    /**
     * 하나의 정거장에서 하차한 승객 수를 세는 함수
     *
     * @param station 해당 정거장의 승/하차 정보
     * @return "Off"의 개수 (하차 인원 수)
     */
    public static int func3(String[] station) {
        int num = 0;
        for (int i=0; i<station.length; i++) {
            if (station[i].equals("Off")) {
                num += 1;
            }
        }
        return num;
    }

    /**
     * 하나의 정거장에서 승차한 승객 수를 세는 함수
     *
     * @param station 해당 정거장의 승/하차 정보
     * @return "On"의 개수 (승차 인원 수)
     */
    public static int func4(String[] station) {
        int num = 0;
        for (int i=0; i<station.length; i++) {
            if (station[i].equals("On")) {
                num += 1;
            }
        }
        return num;
    }
}