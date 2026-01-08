package _2562;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> map = new HashMap<>(9);
        int max = 0;
        int maxIdx = 0;
        // 서로 다른 자연수 입력 - 입력받은 수가 배열에 없는 경우만 추가

        for (int i = 1; i <= 9; i++) {
            int n = sc.nextInt();
            map.put(i, n); // (key, value), 문제는 인덱스는 1부터 시작하므로 i = 1 로 시작

            if (n > max) {
                max = n;
                maxIdx = i;
            }
        }

        System.out.println(max);
        System.out.println(maxIdx);


        // HashSet 중복을 제거하지만 인덱스 개념이 없다 !
        // (문제) 9개의 서로 다른 자연수가 주어진다 -> 우리가 중복 검사를 할 필요가 없다 !



    }
}
