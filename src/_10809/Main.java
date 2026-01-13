package _10809;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // -1 로 채워진 배열 생성
        // 단어 입력 > 'a' 을 뺀 값을 배열에 저장
        int[] intArr = new int[26];
        for (int i : intArr) {
            intArr[i] = -1;
        }

        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = sc.nextInt();
            // intArr[i - 'a']
        }






    }
}
