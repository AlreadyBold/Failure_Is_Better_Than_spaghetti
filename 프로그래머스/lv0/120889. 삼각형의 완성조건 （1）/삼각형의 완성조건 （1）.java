class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int Max = 0;
        int I = 0;
        int sum = 0;
        for (int i=0; i<sides.length; i++){
            if(sides[i]>Max){
                Max = sides[i];
                I = i;
            }
        }
        for(int i=0; i<sides.length; i++){
            if(!(i == I)){
                sum = sum+sides[i];
            }
        }
        if(Max>=sum){
            answer = 2;
        } else if(Max<sum){
            answer = 1;
        }
        
        return answer;
    }
}