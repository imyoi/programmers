package me.myohui.level0.basic;

/**
 * [코딩 기초 트레이닝] Day3 연산
 */
public class Day03 {

    public static void main(String[] args) {
//        String result = "";
//        result = p181942("aaaaa", "bbbbb");
//        result = p181941(new String[]{"a", "b", "c"});
//        result = p181940("string", 3);

        int result = 0;
//        result = p181939(89, 8);
        result = p181938(91,2);
        System.out.println(result);
    }

    /**
     * 문자열 섞기
     * */
    public static String p181942(String str1, String str2) {
        StringBuilder sb = new StringBuilder(str1.length() * 2);
        for (int i=0; i<str1.length(); i++) {
            sb.append(str1.charAt(i));
            sb.append(str2.charAt(i));
        }
        return sb.toString();
    }

    /**
     * 문자 리스트를 문자열로 변환하기
     * */
    public static String p181941(String[] arr) {
        return String.join("", arr);
    }

    /**
     * 문자열 곱하기
     * */
    public static String p181940(String my_string, int k) {
        return my_string.repeat(k);
    }

    /**
     * 더 크게 합치기
     * */
    public static int p181939(int a, int b) {
        int result1 = Integer.parseInt("" + a+b);
        int result2 = Integer.parseInt("" + b+a);
        return Math.max(result1, result2);
    }

    /**
     * 두 수의 연산값 비교하기
     * */
    public static int p181938(int a, int b) {
        int result1 = Integer.parseInt("" + a+b);
        int result2 = Integer.parseInt("" + 2*a*b);
        return Math.max(result1, result2);
    }
}