package me.myohui.level0.beginner;

/**
 * <p>[코딩테스트 입문] 옷가게 할인 받기</p>
 * https://school.programmers.co.kr/learn/courses/30/lessons/120818
 * */
public class P120818_옷가게_할인_받기 {
    public static void main(String[] args) {
        System.out.println(solution(150000));
        System.out.println(solution(580000));
    }

    public static int solution(int price) {
        if (price >= 500000) {
            price *= 0.8;
        } else if (price >= 300000) {
            price *= 0.9;
        } else if (price >= 100000) {
            price *= 0.95;
        }
        return price;
    }
}