package _2439;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // N개의 행을 출력 - i 번째 줄에는 (N-i)개의 공백 + i 개의 별
        for (int i = 1; i <= N; i++) {

            for (int j = 1; j <= (N - i) ; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}