import java.util.*;

public class Main {

    private static class Member implements Comparable<Member>{
        int age;
        String name;

        public Member(int age, String name){
            this.age = age;
            this.name = name;
        }

        @Override
        public int compareTo(Member o){
            return this.age - o.age;
        }

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int N = sc.nextInt(); //회원수

        Member[] memberList = new Member[N];

        for(int i=0; i<N; i++){
            int age = sc.nextInt();
            String name = sc.next();
            memberList[i] = new Member(age, name);
        }

        solution(memberList, sb);

    }

    private static void solution(Member[] memberList, StringBuilder sb){
        Arrays.sort(memberList);

        for(Member member : memberList){
            sb.append(member.age).append(" ").append(member.name).append("\n");
        }

        System.out.print(sb);

    }


}
