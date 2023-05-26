class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        int cnt = 0;
        for ( int i=n; i<num_list.length; i++){
            answer[cnt] = num_list[i];
            if ( cnt+1 >= num_list.length) break;
            else {
                cnt++;
            }
        }
        for( int i=0; i<n; i++){
            answer[cnt] = num_list[i];
            if ( cnt+1 >= num_list.length) break;
            else {
                cnt++;
            }
        }
        
        return answer;
    }
}