import java.util.*;
public class Solution {
    	public Object[] solution(int []arr) {
        for(int i = 0; i< arr.length-1; i++){
            for(int j = i+1; j<arr.length; j++){
                if(!(arr[i] == arr[j])) {
                    break;
                } else if (arr[i]==arr[j]){
                    arr[j] = 10;
                }

            }
        }
        ArrayList<Integer> arr22 = new ArrayList<>();
        for(int i = 0; i<arr.length; i++) {
        	if(!(arr[i] == 10 )) {
        		arr22.add(arr[i]);
        	}
        }
        return arr22.toArray();
        }
  }