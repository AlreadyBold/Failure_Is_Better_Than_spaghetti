import java.util.*;
class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for(int i = 0 ; i<quiz.length; i++ ){
            String[] arr = quiz[i].split(" ");
            //System.out.println( Arrays.toString(arr));
            if ( arr[1].equals("-")){
                //System.out.println ( Integer.parseInt(arr[0]) - Integer.parseInt(arr[2]) == Integer.parseInt(arr[4]) );
                if(Integer.parseInt(arr[0]) - Integer.parseInt(arr[2]) == Integer.parseInt(arr[4])){
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                } 
            } else {
                if(Integer.parseInt(arr[0]) + Integer.parseInt(arr[2]) == Integer.parseInt(arr[4])){
                    answer[i] = "O";
                }else {
                    answer[i] = "X";
                }
            }
        }
        
        
        return answer;
    }
}