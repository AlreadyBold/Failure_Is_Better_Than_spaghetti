import java.util.*;
class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int X = 0;
        int Y = 0;
        for(int i=0; i<sizes.length; i++){
            Arrays.sort(sizes[i]);
        }
        for(int i=0; i<sizes.length; i++){
            if(sizes[i][0] > X){
                X = sizes[i][0];
            }
            if(sizes[i][1] > Y){
                Y = sizes[i][1];
            }
        }
        
        
        return X * Y;
    }
}