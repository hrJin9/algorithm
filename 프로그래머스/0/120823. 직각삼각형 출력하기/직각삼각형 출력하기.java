import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        StringBuilder sb = new StringBuilder();
        for(int i=1; i<=n; i++) {
            for(int j=0; j<i; j++) {
                sb.append("*");
            }
            if (i != n) {
                sb.append("\n");
            }
            
        }

        System.out.println(sb.toString());
    }
}