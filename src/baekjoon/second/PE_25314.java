package baekjoon.second;

import java.util.Scanner;

public class PE_25314 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int total = N / 4;

        String message = "";
        for (int i = 0; i < total; i++) {
            message = message + "long ";
        }
        String result = message + "int";
        System.out.println(result);

    }
}
