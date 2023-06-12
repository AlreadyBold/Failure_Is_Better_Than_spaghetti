import java.util.*;
class Solution {
   public int[] solution(int[] arr, boolean[] flag) {
	        
	        ArrayList<Integer> arraylist = new ArrayList();
	        for(int i=0; i<arr.length; i++ ){
	            if( flag[i] == true){
	                for(int j=0; j<arr[i]*2; j++){
	                	arraylist.add(arr[i]);
	                }
	            } else {
                    for(int j=0; j<arr[i]; j++){
                       	arraylist.remove(arraylist.size()-1); 
                    }

	            }
	        }
       
        int[] answer = new int[arraylist.size()];
       for(int i=0; i<answer.length; i++ ){
           answer[i] = arraylist.get(i);
       }
	        
	        
	        return answer;
	    }
}