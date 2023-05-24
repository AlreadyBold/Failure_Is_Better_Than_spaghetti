class Solution {
    public int solution(int[] dot) {
        int answer = 0;
        if (dot[0] * dot[1] > 0){
            answer = 1;
        } else if(dot[0] * dot[1] <0){
            answer = 2;
        }
        
        if(dot[1] > 0){
            answer = answer;
        } else if(dot[1]<0){
            answer = answer+2;
        }
        return answer;
    }
}