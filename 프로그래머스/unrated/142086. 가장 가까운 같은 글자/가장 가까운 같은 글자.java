class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        answer[0] = -1;
        int count = 1; 
        for(int i = s.length()-1; i>0; i--){
            for(int j = i-1; j>=0; j--){
                if(s.charAt(j) == s.charAt(i)){
                    // System.out.println(" i = "+ i + " j ="+ j + " count = "+ count);
                    answer[i] = count;
                    count = 1;
                    break;
                } else if (j == 0 ){
                    answer[i] = -1;
                    count = 1;
                } else {
                    count++;
                }
            }
        }
        
        
        
        return answer;
    }
}