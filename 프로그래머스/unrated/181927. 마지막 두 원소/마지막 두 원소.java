class Solution {
    public int[] solution(int[] num_list) {
        int len = num_list.length - 1;
        int[] answer = new int [len+2];
        int a = 0;
        if ( num_list[len] > num_list[len-1] ) {
            a = num_list[len] - num_list[len-1];
        } else {
            a = num_list[len] * 2 ;
        }
        
        for ( int i = 0 ; i<len+1; i++ ){
            answer[i] = num_list[i];
        }
        answer[len+1] = a ;
        
        return answer;
    }
}