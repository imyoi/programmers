package me.myohui.level0.pcce;

/**
 * <p><b>[PCCE 기출문제] 6번 / 물 부족</b></p>
 *
 * ㅇㅇ시에는 저수지가 하나 있으며, 도시에서 사용하는 모든 물은 이 저수지의 물을 사용합니다.
 * 이상 기후로 인해 극심한 가뭄이 예고된 상황에서,
 * 지난 달의 물 사용량과 이번 달부터 일정 기간 동안의 월별 물 사용량 변화를
 * 예측한 값을 이용해 몇 달 뒤 물이 부족해지는지를 예측하려고 합니다.
 *
 * <p>이번달부터의 월별 물 사용량 변화를 예측한 값은 다음과 같이 리스트에 담겨 주어집니다.</p>
 * <ul>
 *   <li>{@code [10, -10, 10, -10, 10, -10, 10, -10, 10, -10]}</li>
 *   <li>리스트의 각 원소는 해당 월의 물 사용량이 전 달에 비해 몇 % 만큼 증가 또는 감소하는지를 나타냅니다.</li>
 *   <li>예를 들어, 이번달의 물 사용량 (리스트의 첫 번째 원소)은 지난 달 보다 10% 증가한 값이며, 다음 달(리스트의 두 번째 원소)의 물 사용량은 이번달 사용량에서 10%만큼 감소한 값입니다.</li>
 * </ul>
 *
 * 현재 저수지에 저장된 물의 양을 나타내는 정수 {@code storage},
 * 지난 달 물 사용량을 나타내는 정수 {@code usage},
 * 월별 물 사용량 변화가 담긴 정수 리스트 {@code change}가 주어질 때,
 * 몇 달 뒤 물이 부족해지는지를 반환하는 {@code solution} 함수를 작성하려 합니다.
 * 가뭄이 끝날 때까지 저수지의 물이 남아 있다면 {@code -1}을 반환합니다.
 */
public class P340202_물_부족 {
    public static void main(String[] args) {
        int storage = 5141;
        int usage = 500;
        int[] change = {10, -10, 10, -10, 10, -10, 10, -10, 10, -10};

//        int storage = 1000;
//        int usage = 2000;
//        int[] change = {-10, 25, -33};

        int result = solution(storage, usage, change);
        System.out.println(result);
    }

    public static int solution(int storage, int usage, int[] change) {
        int total_usage = 0;
        for(int i=0; i<change.length; i++){
            usage += usage * change[i] / 100;
            total_usage += usage;
            if(total_usage > storage){
                return i;
            }
        }
        return -1;
    }
}