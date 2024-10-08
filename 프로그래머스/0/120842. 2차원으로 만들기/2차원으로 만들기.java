class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length/n][n];
        for (int i=0; i<n; i++) {
            for (int j=0; j<num_list.length/n; j++) {
                answer[j][i] = num_list[j*n+i];
            }
        }
        
        return answer;
    }
}