package me.myohui.level0.pcce;

/**
 * <p>[PCCE 기출문제] 8번 / 창고 정리</p>
 *
 * 선빈이는 게임을 즐기던 중 가지고 있는 물건이 너무 많아 창고 정리를 하기로 했습니다.
 * 선빈이가 보유한 게임 속 창고는 여러 칸으로 나누어져 있고 각 칸에는 물건들이 담겨있습니다.
 * 창고를 정리할 방법을 고민하던 선빈이는 같은 물건이 여러 칸에 나누어 들어있는 것을 발견하고
 * 우선 같은 물건끼리 최대한 겹쳐쌓는 방식으로 창고를 정리하기로 했습니다.
 * <p>
 * 선빈이의 창고에 들어있는 물건의 이름과 개수는 리스트 형태로 주어지며,
 * 한 칸에 겹쳐질 수 있는 물건의 개수에는 제한이 없다고 가정합니다.
 * </p>
 * <ul>
 *   <li>정리되기 전 창고의 물건 이름이 담긴 문자열 리스트 storage</li>
 *   <li>각 물건의 개수가 담긴 정수 리스트 num 이 주어질 때</li>
 * </ul>
 *
 *
 * 정리된 창고에서 개수가 가장 많은 물건의 이름을 return 하는 함수입니다
 * solution 함수가 올바르게 작동하도록 한 줄을 수정해 주세요.
 */
public class P250126_창고_정리 {

    public static void main(String[] args) {
        String[] storage = {"apple", "steel", "leaf", "apple", "leaf"};
        int[] num = {5, 3, 5, 3, 7}; // result = doll

        String result = solution(storage, num);
        System.out.println(result);
    }

    public static String solution(String[] storage, int[] num) {
        int num_item = 0;
        String[] clean_storage = new String[storage.length];
        int[] clean_num = new int[num.length];

        for (int i=0; i<storage.length; i++) {
            int clean_idx = -1;
            for (int j=0; j<num_item; j++) { //
                if (storage[i].equals(clean_storage[j])) {
                    clean_idx = j;
                    break;
                }
            }
            if (clean_idx == -1) {
                clean_storage[num_item] = storage[i];
                clean_num[num_item] = num[i];
                num_item += 1;
            } else {
                clean_num[clean_idx] += num[i];
            }
        }

        // 아래 코드에는 틀린 부분이 없습니다.
        int num_max = -1;
        String answer = "";
        for (int i=0; i<num_item; i++) {
            if (clean_num[i] > num_max) {
                num_max = clean_num[i];
                answer = clean_storage[i];
            }
        }
        return answer;
    }
}