class Solution {
    public int[] solution(int[] num_list, int n) {
        int y = 0;
        if ( num_list.length% n == 0 ){
            y = num_list.length/n;
        } else {
            y = (num_list.length/n) + 1;
        }
        
        int[] answer = new int[y];
        
        for(int i = 0; i<y; i++){
            answer[i] = num_list[i*n];
            if( ( i+1 * n) > num_list.length ) break;
        }
        
        
        
        
        
        return answer;
    }
}