class Solution {
    public String solution(String bin1, String bin2) {

        int bin11 = Integer.parseInt(bin1,2);        
        int bin22 = Integer.parseInt(bin2,2);
        int sum = bin11 + bin22;
        
        String answer = Integer.toString(sum,2);
        
        return answer;
    }
}