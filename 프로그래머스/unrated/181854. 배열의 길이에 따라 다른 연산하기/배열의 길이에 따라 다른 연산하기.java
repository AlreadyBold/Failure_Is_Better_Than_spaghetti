class Solution {
    public int[] solution(int[] arr, int n) {
        int arrlen = arr.length;
        int[] answer = arr.clone();
        if ( arrlen % 2 == 0 ) {
            for(int i=1; i<arrlen; i++){
                answer[i] = arr[i]+n;
                if ( arrlen < i+2)break;
                i++;
            }
            
        } else {
            for(int i=0; i<arrlen; i++){
                answer[i] = arr[i]+n;
                if ( arrlen < i+2)break;
                i++;
            }
            
        }
        
        
        return answer;
    }
}