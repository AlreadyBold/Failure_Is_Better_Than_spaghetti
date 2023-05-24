import java.util.*;
class Solution {
    public String solution(String s) {
		 String answer = "";
		 String [] a = s.split(" ");
		 int [] arr = new int[a.length];
		  for(int i = 0; i<a.length; i++) {
			 arr[i] = Integer.parseInt(a[i]);
		 }
        
		 Arrays.sort(arr);
		 /* 개 구데기 쓸모없는 코드 
         for(int i = 0; i<arr.length; i=+arr.length-1) {
			 answer = answer+String.valueOf(arr[i]);
             answer = answer+" ";
             
		 } */
        answer = arr[0] + " " + arr[arr.length-1];

		 
		 
	                
	     return answer;
	 }
}