package me.myohui.level0.pcce;

import java.util.Scanner;

/**
 * <p>[PCCE 기출문제] 4번 / 저축</p>
 *
 * 진우는 돈을 모으기 위해 저축을 하려고 합니다.
 * 목표로 하는 금액은 100만 원이며, 첫 달에 일정 금액을 넣은 뒤 70만 원까지는 매월 조금씩 저축하다가
 * 70만 원 이후부터는 월 저축량을 늘려 빠르게 목표 금액을 달성하고자 합니다.
 *
 * <ul>
 *   <li>첫 달에 저축하는 금액을 나타내는 정수 {@code start},</li>
 *   <li>두 번째 달 부터 70만 원 이상 모일 때까지 매월 저축하는 금액을 나타내는 정수 {@code before},</li>
 *   <li>100만 원 이상 모일 때 까지 매월 저축하는 금액을 나타내는 정수 {@code after} 가 주어질 때,</li>
 * </ul>
 *
 * 100만 원 이상을 모을 때까지 걸리는 개월 수를 출력하도록 빈칸을 채워 코드를 완성해 주세요.
 * */
public class P250130_저축 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();  // 28
        int before = sc.nextInt(); // 6
        int after = sc.nextInt();  // 8

        int money = start; // 28
        int month = 1;
        while (money < 70) {
            money += before;
            month++;
        }
        while (money < 100) {
            money += after;
            month++;
        }

        System.out.println(month); // 12
    }
}