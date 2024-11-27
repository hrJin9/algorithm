import java.util.*;

public class Main {
    public static int[] unf;
    public static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        // 초기화
        unf = new int[n+1];
        for(int i=1; i<=n; i++) {
            unf[i] = i;
        }

        // 유니온
        for(int i=1; i<=m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            Union(a, b, i);
        }

        System.out.println(count);

    }

    public static void Union(int a, int b, int i) {
        int fa = Find(a); // a노드의 루트
        int fb = Find(b); // b노드의 루트

        if(fa != fb) {
            unf[fa] = fb; // a의 루트의 루트는 b의 루트가 된다.
        } else {
            if(count == 0)
                count = i;
        }
    }

    public static int Find(int a) {
        if (a == unf[a])
            return a;
        return unf[a] = Find(unf[a]);
    }
}