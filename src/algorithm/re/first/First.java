package algorithm.re.first;

public class First {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{100,180,360,100,270,400}));
    }

    static long solution(int[] weights) {
        long answer = 0;
        for(int i=0; i<weights.length; i++) {
            for(int j=weights.length-1; j>=0; j--) {
                if(i == j) break;
                if(weights[i] == weights[j] ||
                   weights[i] == weights[j] * 2/1 ||
                   weights[i] == weights[j] * 1/2 ||
                   weights[i] == weights[j] * 3/2 ||
                   weights[i] == weights[j] * 2/3 ||
                   weights[i] == weights[j] * 2 ||
                   weights[i] == weights[j] * 4/3 ||
                   weights[i] == weights[j] * 3/4) {
                    answer++;
                }
            }
        }
        return answer;
    }
}
