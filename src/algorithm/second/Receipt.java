package algorithm.second;

import java.util.Scanner;

//class 이름은 main으로 변경할 것
public class Receipt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt(), N = sc.nextInt();
        int sum = 0;

        for(int i=0; i<N; i++){
            sum += sc.nextInt() * sc.nextInt();
        }
        String ans = (X == sum)?"Yes":"No";
        System.out.println(ans);
    }
}
