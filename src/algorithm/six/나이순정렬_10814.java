package algorithm.six;
import java.util.*;

public class 나이순정렬_10814 {

    private static class Member{
        int age;
        String name;
        int idx;

        public Member(int age, String name, int idx){
            this.age = age;
            this.name = name;
            this.idx = idx;
        }

    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //회원수

        List<Member> memberList = new ArrayList<>();

        for(int i=0; i<N; i++){
            int age = sc.nextInt();
            String name = sc.next();
            Member member = new Member(age, name, i);
            memberList.add(member);
        }

        solution(memberList);

    }

    private static void solution(List<Member> memberList){
        for(int i=1; i<memberList.size(); i++){
            int tmp = memberList.get(i).age;
            int prevI = i - 1;

            while((prevI >= 0) && memberList.get(prevI).age > tmp ){
                memberList.set(i, )
//                Collections.swap(memberList, prevI+1, prevI);
//                prevI--;
            }


        }

        String print = "";
        for(Member m : memberList){
            print += m.age + " " + m.name + "\n";
        }

        System.out.print(print);
    }


}
