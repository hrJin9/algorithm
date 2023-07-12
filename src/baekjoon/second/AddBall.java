package baekjoon.second;

public class AddBall {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt(), M = sc.nextInt();
//
//        //입력받은만큼 리스트를 생성한 뒤 0으로 초기화해준다
//        List<Integer> basket = new ArrayList<>(Collections.nCopies(N,0));
//
//        for (int m = 0; m < M; m++) {
//            int i = sc.nextInt(), j = sc.nextInt(), k = sc.nextInt();
//
//            for (int n = i; n < j+1; n++) {
//                basket.set(n-1, k);
//            }
//        }
//
//        String basketStr = basket.stream().map(String::valueOf).collect(Collectors.joining(" "));
//        System.out.println(basketStr);

    public static void main(String[]args) throws Exception{
        int arrlen=read();
        int []arr = new int[arrlen];
        int count = read();
        for(int i=0;i<count;i++){
            int a = read();
            int b = read();
            int num = read();
            for(int k = a-1;k<b;k++){
                arr[k] = num;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<arrlen;i++){
            sb.append(arr[i]).append(" ");
        }
        System.out.println(sb);
    }
    private static int read() throws Exception{
        int c, n = System.in.read() & 15;
        while((c=System.in.read())>32){
            n = (n<<3) + (n<<1) + (c&15);
        }
        return n;
    }

}
