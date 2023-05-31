class Solution {
    public int solution(String number) {
        int answer = 0;
        int elseee = 0;
        for ( int i =0; i<number.length(); i++){
            elseee = elseee + number.charAt(i) - 48;
        }
        answer = elseee%9;
        
        return answer;
    }
}