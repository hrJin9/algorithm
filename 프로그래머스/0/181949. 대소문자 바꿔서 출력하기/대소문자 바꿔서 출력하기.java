import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        StringBuilder sb = new StringBuilder();
        
        for (char c : a.toCharArray()) {
            if (Character.isUpperCase(c)) {
                sb.append(Character.toString(c).toLowerCase());
            } else {
                sb.append(Character.toString(c).toUpperCase());
            }
        }
        
        System.out.println(sb.toString());
        
    }
}