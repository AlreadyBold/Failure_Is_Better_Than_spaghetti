class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[arr.length];
        int a = 0;
        for(int i=0; i<queries.length; i++){
            a = arr[queries[i][1]];
            arr[ queries[i][1] ] = arr[ queries[i][0] ];
            arr[ queries[i][0] ] = a;
        }
        
        return arr;
    }
}