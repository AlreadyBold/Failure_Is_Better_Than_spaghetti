class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        
        double a = ( num1 / (num2 * 1.0) ) * 1000;
        answer = (int) Math.floor(a);
        return answer;
    }
}