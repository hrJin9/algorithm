package baekjoon.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Count_10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tcnt = sc.nextInt();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < tcnt; i++) {
            list.add(sc.nextInt());
        }
        int v = sc.nextInt();
        int total=0;
        for (Integer cnt : list) {
            if(cnt == v) total++;
        }

        System.out.println(total);


//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        int[] K = new int[201];
//        for(int i=0; i<N ;i++)
//            K[sc.nextInt()+100]++;
//        System.out.println(K[sc.nextInt()+100]);
    }
}
