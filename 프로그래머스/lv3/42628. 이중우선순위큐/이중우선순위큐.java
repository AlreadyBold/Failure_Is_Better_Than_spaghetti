import java.util.*;
class Solution {
    public int[] solution(String[] operations) {
        int[] answer = new int[2];
        ArrayList<Integer> arr = new ArrayList();
        for(int i=0; i<operations.length; i++ ){
            String [] op = operations[i].split(" ");
            if(op[0].equals("I")){
                arr.add(Integer.parseInt(op[1]) );
                Collections.sort(arr);
            } else {
                if (op[1].contains("-")){
                    if( arr.size()>0){
                        arr.remove(0);
                    }
	            } else {
                    if( arr.size()>0){
                        arr.remove(arr.size()-1);
                    }
                }
            }
        }
        if ( arr.size() > 0 ) {
            answer[1] = arr.get(0);
            answer[0] = arr.get(arr.size()-1);
        }

        
        
        return answer;
    }
}