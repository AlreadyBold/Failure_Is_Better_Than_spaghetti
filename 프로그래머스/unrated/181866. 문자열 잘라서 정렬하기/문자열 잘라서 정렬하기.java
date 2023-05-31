import java.util.*;
class Solution {
    public String[] solution(String myString) {
        String[] arr1 = myString.split("x");
        Arrays.sort(arr1);
        ArrayList<String> arr2 = new ArrayList();
        int cnt = 0;
        
        for(int i = 0 ; i<arr1.length; i++ ){
            if(arr1[i].equals("")){
            } else{
                arr2.add(arr1[i]);
                cnt++;
            }
        }
        String[] answer = arr2.toArray(new String[arr2.size()]);
        
        

        return answer;
    }
}