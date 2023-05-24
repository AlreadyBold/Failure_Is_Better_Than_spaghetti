class Solution {
    public int[] solution(int start, int end) {
        int k = start-end+1;
        int[] answer = new int[k];
        
        for ( int i = 0 ; i<k; i++){
            answer[i] = start-i;
        }
        return answer;
    }
}