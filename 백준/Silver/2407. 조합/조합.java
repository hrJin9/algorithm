import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Main {
    static BigInteger[][] memo;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        memo = new BigInteger[n+1][m+1];
        for(int i=0; i<=n; i++) {
            Arrays.fill(memo[i], BigInteger.ZERO);
        }
        BigInteger result = combination(n, m);
        System.out.println(result);
    }
    
    public static BigInteger combination(int n, int m) {
        if(!memo[n][m].equals(BigInteger.ZERO)) return memo[n][m];
        if(n==m || m==0) return memo[n][m] = BigInteger.ONE;
        return memo[n][m] = combination(n-1, m-1).add(combination(n-1, m));
    }
    
}