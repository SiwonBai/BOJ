package _10809;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // -1 로 채워진 배열 생성
        // 단어 입력 > 'a' 을 뺀 값을 배열에 저장
        int[] intArr = new int[26];
        String s = sc.next();

        for (int i = 0; i < 26; i++) {
            intArr[i] = -1;
        }

        // 반복문을 통해 문자열의 각 문자를 검사
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (intArr[c - 'a'] == -1) {
                intArr[c - 'a'] = i; // 'b' - 'a' = 1, 1번째 인덱스에 i 대입
            }
        }

        for (int i = 0; i < intArr.length; i++) {
            System.out.print(intArr[i] + " ");
        }








    }
}
