class Solution {
    public int solution(String num_str) {
       int answer = 0;
        num_str = num_str.replaceAll("0","");
        for(int i=0; i<num_str.length(); i++ ){
            answer = answer+(int)num_str.charAt(i)-48; 
        }
        
        return answer;
    }
}