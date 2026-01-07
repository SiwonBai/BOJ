package _11720;

import java.util.Scanner;

// 숫자의 합
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 숫자의 개수 N
        sc.nextLine();

        // 둘째 줄에 숫자 N개가 공백없이 주어진다
        // -> String 으로 받아 공백에서 잘라 int로 변형하여 합계를 구함
        String numStr = sc.next();
        String[] arr = numStr.split("");
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += Integer.parseInt(arr[i]);
        }

        System.out.println(sum);


        // === 배열을 생성하지 않고 하는 방법 ===
        int n2 = sc.nextInt();
        String numStr2 = sc.next();

        int sum2 = 0;
        for (int i = 0; i < numStr2.length(); i++) {
            sum2 += numStr2.charAt(i) - '0';
        }
        System.out.println(sum2);

    }
}
