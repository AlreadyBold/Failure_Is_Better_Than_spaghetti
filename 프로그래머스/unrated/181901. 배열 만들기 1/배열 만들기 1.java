class Solution {
    public int[] solution(int n, int k) {
        // 갯수 구하기 
        int a = n/k;
        int[] answer = new int[a];
        for(int i = 1 ; i<=a;i++){
            answer[i-1] = i*k;
        }
        
        
        
        return answer;
    }
}