class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = {};
        int l = arr.length;
        if( k%2 == 1 ){
            for( int i=0; i<l; i++ ){
                arr[i] = arr[i]*k;
            }
        } else {
            for( int i=0; i<l; i++ ){
                arr[i] = arr[i]+k;
            } 
        }
        return arr;
    }
}