package _3052;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 중복된 값을 허용하지 않는 HashSet 클래스 선언
        HashSet<Integer> numSet = new HashSet<>(10);
        for (int i = 0; i < 10; i++) {
            int A = sc.nextInt();
            numSet.add(A % 42); // 42로 나눈 나머지를 저장
        }

        System.out.println(numSet.size());
    }
}
