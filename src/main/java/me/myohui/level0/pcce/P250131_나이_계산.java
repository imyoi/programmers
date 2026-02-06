package me.myohui.level0.pcce;

import java.util.Scanner;

/**
 * <p>[PCCE 기출문제] 3번 / 나이 계산</p>
 *
 * 나이를 세는 방법에는 여러가지가 있습니다.
 * 그중 한국식 나이는 태어난 순간 1살이 되며 해가 바뀔 때마다 1살씩 더 먹게 됩니다.
 * 연 나이는 태어난 순간 0살이며 해가 바뀔 때마다 1살씩 더 먹게 됩니다.
 *
 * <p>각각 나이의 계산법은 다음과 같습니다.</p>
 * <ul>
 *   <li>한국식 나이: {@code 현재 연도 - 출생 연도 + 1}</li>
 *   <li>연 나이: {@code 현재 연도 - 출생 연도}</li>
 * </ul>
 *
 * 출생 연도를 나타내는 정수 {@code year}와, 구하려는 나이의 종류를 나타내는 문자열 {@code age_type}이 주어질 때,
 * 2030년에 몇 살인지 출력하도록 빈칸을 채워 코드를 완성해 주세요.
 *
 * <p>
 * {@code age_type}이 {@code "Korea"}인 경우 한국식 나이를,
 * {@code "Year"}인 경우 연 나이를 출력합니다.
 * </p>
 */
public class P250131_나이_계산 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();     // 2000
        String age_type = sc.next(); // Korea
        int answer = 0;

        if (age_type.equals("Korea")) {
            answer = 2030 - year + 1;
        }
        else if (age_type.equals("Year")) {
            answer = 2030 - year;
        }

        System.out.println(answer); // 31
    }
}