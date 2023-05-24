class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int a1len = arr1.length;
        int a2len = arr2.length;
        if ( a1len> a2len){
            return 1 ;
        } else if ( a1len < a2len ){
            return -1 ;
        } else {
            int ar1 = 0;
            int ar2 = 0;
            for ( int i=0; i<a1len; i++ ){
                ar1 = ar1+ arr1[i];
                ar2 = ar2+ arr2[i];
            }
            if (ar1 > ar2) return 1;
            else if (ar1 < ar2 ) return -1;
            else return 0;
        }
    }
}