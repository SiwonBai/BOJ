package _10818;

import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // 정수를 받기 위해 크기가 N인 ArrayList<Integer> 선언
        ArrayList<Integer> numsArr = new ArrayList<>(N);
        for (int i = 0; i < N; i++) {
            numsArr.add(sc.nextInt());
        }

        int max = numsArr.get(0);
        int min = numsArr.get(0);

        for (int i = 0 ; i < N ; i++) {
            if (numsArr.get(i) > max) max = numsArr.get(i);
            if (numsArr.get(i) < min) min = numsArr.get(i);
        }

        System.out.println(min + " " + max);


    }
}
