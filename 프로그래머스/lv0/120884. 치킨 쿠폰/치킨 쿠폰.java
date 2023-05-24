class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int k = 0;
            for(int i = 0; i<10; i++){
                k = k+chicken%10; 
                chicken = chicken/10; 
                answer = answer+chicken; 
            }
            System.out.println(k);
            for(int i = 0; i<5; i++ ){
                    answer = answer+ k/10;
                    k = (k/10) + (k%10);
                    k = k+k/10;
                }
            
                
        return answer;
    }
}