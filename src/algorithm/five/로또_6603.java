package algorithm.five;
import java.util.*;

public class 로또_6603 {

    private static StringBuilder sb;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            int k = sc.nextInt();
            sb = new StringBuilder();

            if(k == 0) // k가 0이면 입력 종료
                break;
            int[] numbers = new int[k];
            for(int i=0; i<k; i++){
                numbers[i] = sc.nextInt();
            }

            solution(numbers, new int[6], 0, 0);
            System.out.println(sb.toString());
        }

    }

    public static void solution(int[] numbers, int[] result, int index, int count){
        if(count == 6){
            for(int i=0; i<6; i++){
                sb.append(result[i]);
                if(i<5)
                    sb.append(" ");
            }
            sb.append("\n");
            return;
        }

        if(index == numbers.length)
            return;

        // 현재 인덱스 숫자 선택한 경우
        result[count] = numbers[index];
        solution(numbers, result, index + 1, count + 1);

        // 현재 인덱스 숫자 선택하지 않은 경우
        solution(numbers, result, index + 1, count);

    }



}
