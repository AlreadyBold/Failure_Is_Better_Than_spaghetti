import java.util.*;
class Solution {
    public String solution(String polynomial) {
        String answer = "";
        int a = 0;
        int b = 0;
        polynomial = polynomial.replace(" + ","abc");
        String[] arr = polynomial.split("abc");
        System.out.println(Arrays.toString(arr));
        
        for(int i = 0; i < arr.length; i++ ){
            if(arr[i].contains("x")){
                if(arr[i].length() == 1){
                    a++;
                }else {
                a = a+ Integer.parseInt(arr[i].replace("x",""));
                }
            } else {
                b = b+Integer.parseInt(arr[i]);
            }
        }

        if(a == 0 ){
            answer = String.valueOf(b);
        }else if ( b== 0){
            if( a == 1 ){
                answer = "x";
            }else{
            answer = a+"x";
            }
        } else {
            if( a == 1 ){
                answer = "x + "+b;
            }else {
            answer = a+"x + "+b;
            }
        }
        
        
        
        
        return answer;
    }
}