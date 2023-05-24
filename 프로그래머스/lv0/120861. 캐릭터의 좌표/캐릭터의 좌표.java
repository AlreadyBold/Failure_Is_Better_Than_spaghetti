class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0,0};
        int X = (board[0]/2) + 1;
        int Y = (board[1]/2) + 1;
        int XX = -(board[0]/2) - 1;
        int YY = -(board[1]/2) - 1;
        for(int i = 0; i<keyinput.length; i++ ){
            if(keyinput[i].equals("left")){
                answer[0] = answer[0]-1;
                if(answer[0] <= XX){
                    answer[0] = answer[0]+1;
                }
            } else if(keyinput[i].equals("right")){
                answer[0] = answer[0]+1;
                if(answer[0] >= X){
                    answer[0] = answer[0]-1;
                }
               
            } else if(keyinput[i].equals("up")){
                answer[1] = answer[1]+1;
                if(answer[1] >= Y){
                    answer[1] = answer[1]-1;
                }
            } else if(keyinput[i].equals("down")){
                answer[1] = answer[1]-1;
                if( answer[1] <= YY ){
                    answer[1] = answer[1]+1;
                }
            } 
        }
        return answer;
    }
}