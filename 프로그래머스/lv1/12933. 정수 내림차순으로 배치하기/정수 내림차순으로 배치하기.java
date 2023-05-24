import java.util.*;
class Solution {
    public long solution(long n) {
        String answer = "";
        String str1 = Long.toString(n);
        Integer[] arr = new Integer [str1.length()];
        for(int i = 0; i<str1.length(); i++){
            arr[i] = str1.codePointAt(i)-48;
        }
        
        Arrays.sort(arr,Collections.reverseOrder());
        
        for(int i= 0 ; i<arr.length; i++ ){
            answer = answer+arr[i];
        }
        
        
        return Long.parseLong(answer);
    }
}