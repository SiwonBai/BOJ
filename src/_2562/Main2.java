package _2562;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numArr = new int[9];
        for (int i = 0; i < numArr.length ; i++) {
            numArr[i] = sc.nextInt();
        }

        int max = numArr[0];
        int idx = 0;

        for (int i = 0; i < numArr.length; i++) {
            if (numArr[i] > max) {
                max = numArr[i];
                idx = i;
            }
        } // for

        System.out.println(max);
        System.out.println(idx + 1);

    }
}
