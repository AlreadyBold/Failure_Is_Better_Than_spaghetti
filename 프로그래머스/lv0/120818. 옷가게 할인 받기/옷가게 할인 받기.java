class Solution {
    public int solution(int price) {
        double h = 0;
        if (price < 100000){
            h = 1;
        } else if(price <300000){
            h = 0.95;
        } else if(price <500000){
            h = 0.9;
        } else {
            h = 0.8;
        }
        h = price * h;
        int answer = (int) h;
        
        return answer;
    }
}