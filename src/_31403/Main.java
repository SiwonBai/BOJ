package _31403;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1. 정수 입력받기
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        // 2. 숫자형 A + B - C
        System.out.println(A + B - C);

        // 3. 문자열 A + B - C
        String result1 = Integer.toString(A) + Integer.toString(B);
        System.out.println(Integer.parseInt(result1) - C);

        // 숫자 -> 문자열 : Integer.toString(n)
        // 문자열 -> 숫자 : Integer.parseInt(n) - int로 변환 (null을 가질 수 없다), Integer.valueOf(n) - Integer 객체로 반환


    }
}
