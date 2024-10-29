import java.io.*;
import java.util.*;

class Main {
    static int N;
    static String[] arr;
    static String[] tempArr;
    static boolean[] visited;
    static int time;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while((line = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(line);
            String temp = st.nextToken();
            arr = temp.split("");
            time = 0;
            tempArr = new String[arr.length];
            visited = new boolean[arr.length];
            N = Integer.parseInt(st.nextToken());

            solution(0);

            String answer = temp + " " + N + " = ";
            if(time < N) {
                answer += "No permutation";
            } else {
                for(int i = 0; i < arr.length; i++) {
                    answer += arr[i];
                }
            }

            System.out.println(answer);
        }
    }

    public static void solution(int cnt) {
        if(cnt == arr.length) {
            time++;
            if(time == N) {
                for(int i = 0; i < arr.length; i++) {
                    arr[i] = tempArr[i];
                }
            }
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if(visited[i])
                continue;

            tempArr[cnt] = arr[i];
            visited[i] = true;
            solution(cnt + 1);
            visited[i] = false;
        }
    }
}
