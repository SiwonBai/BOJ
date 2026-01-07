package _10818;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        // 1. 숫자 개수 n과 공백으로 구분된 n개의 숫자를 입력받는다
        int n = sc.nextInt();         // 숫자만 읽음 (개행 문자는 남음)
        sc.nextLine();                // ‼️남아있던 개행 문자 제거
        String line = sc.nextLine();  // 여러 숫자

        // 2. " "으로 구분한 출력값 배열로 저장
        String[] numberStr = line.split(" ");

        // 3. 문자열 배열을 숫자열 배열로 변경
        int[] numberInt = new int[n];
        for (int i = 0; i < numberStr.length; i++) {
            numberInt[i] = Integer.parseInt(numberStr[i]);
        }

        int max = numberInt[0];
        int min = numberInt[0];

        for (int i = 0; i < numberInt.length; i++) {
            if (numberInt[i] > max) max = numberInt[i];
            if (numberInt[i] < min) min = numberInt[i];
        }

        System.out.print(min + " " + max);

        /*
            5\n
            20 10 35 30 7\n

            nextInt() 는 5만 읽는다. \n는 입력버퍼에 남겨둔다
            nextLine() 은 현재 위치부터 엔터(\n) 전까지 문자열을 읽음
                -> sc.nextLine() 이 없다면 line == "" 빈 문자열이 될 것
            그래서 sc.nextLine()을 통해 \n을 입력버퍼에서 제거한 후, 다음 줄을 읽는다

        */

    }
}
