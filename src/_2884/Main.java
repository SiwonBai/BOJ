package _2884;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // 45분 일찍 알람 설정하기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int newH = 0;
        int newM = 0;

        if (H > 0 && M >= 45) {
            newH = H;
            newM = M - 45;
        }

        if (H > 0 && M < 45) {
            newH = H - 1;
            newM = (M + 60) - 45;
        }

        if (H == 0 && M >= 45) {
            newH = 0;
            newM = M - 60;
        }

        if (H == 0 && M < 45) {
            newH = 23;
            newM = (M + 60) - 45;
        }

        bw.write(String.valueOf(newH) + " " + String.valueOf(newM));
        bw.flush();


    }
}
