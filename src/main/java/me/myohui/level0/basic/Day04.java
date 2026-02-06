package me.myohui.level0.basic;

/**
 * [코딩 기초 트레이닝] Day4 연산, 조건문
 */
public class Day04 {

    public static void main(String[] args) {
        int result = 0;
//        result = p181937(34, 3);
//        result = p181936(60, 2, 3);
//        result = p181935(7);
//        result = p181934("<", "=", 20, 50);
        result = p181933(-4, 7, true);
        System.out.println(result);
    }

    /**
     * n의 배수
     * */
    public static int p181937(int num, int n) {
        return (num % n == 0) ? 1 : 0;
    }

    /**
     * 공배수
     * */
    public static int p181936(int number, int n, int m) {
        if (number % n == 0 && number % m == 0) {
            return 1;
        }
        return 0;
    }

    /**
     * 홀짝에 따라 다른 값 변환하기
     * */
    public static int p181935(int n) {
        int sum = 0;
        for (int i=n; i>=0; i-=2) {
            sum += ((n % 2 == 0) ? i * i : i);
        }
        return sum;
    }

    /**
     * 조건 문자열
     * */
    public static int p181934(String ineq, String eq, int n, int m) {
        int answer = 0;
        if ("<".equals(ineq)) {
            if ("=".equals(eq)) {
                answer = n<=m ? 1 : 0;
            } else {
                answer = n<m ? 1 : 0;
            }
        } else {
            if ("=".equals(eq)) {
                answer = n>=m ? 1 : 0;
            } else {
                answer = n>m ? 1 : 0;
            }
        }
        return answer;
    }

    /**
     * flag에 따라 다른 값 변환하기
     * */
    public static int p181933(int a, int b, boolean flag) {
        return flag ? a+b : a-b;
    }
}