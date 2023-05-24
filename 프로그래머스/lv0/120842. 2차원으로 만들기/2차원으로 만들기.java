class Solution {
    public int[][] solution(int[] num_list, int n) {
        int a = num_list.length/n;
        int b = 0;
        // 한 반에 30명씩 11반 
        // String [ ][ ] school = new String [11][30];
        int [][] nl = new int [a][n];
        for(int i = 0; i<a; i++){
            for (int j = 0 ; j<n ; j++){
                nl[i][j] = num_list[b];
                b++;
            }
        }
        return nl;
    }
}