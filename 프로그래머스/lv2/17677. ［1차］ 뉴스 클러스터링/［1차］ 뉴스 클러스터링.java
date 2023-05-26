import java.util.*;
class Solution {
    public int solution(String str1, String str2) {
        // a 와 b 모두 공집합 ==> 1 
        // 기타 공백이나 숫자, 특수 문자가 들어있는 경우는 그 글자 쌍을 버린다.
        int answer = 0;
        String Aregex = "^[a-zA-Z]*$";
        
        // 1번 문자열 검증관련 정보
        ArrayList<String> str1Array = new ArrayList();
        int str1len = str1.length();
        // 2번 문자열 검증관련 정보
        ArrayList<String> str2Array = new ArrayList();
        int str2len = str2.length();
        
        // 1번 문자열 만들기
        for ( int i = 0; i<str1len-1; i++) {
            String test = Character.toString( str1.charAt(i) ) +Character.toString( str1.charAt(i+1) );
            if (test.matches(Aregex) ) {
                test = test.toUpperCase();
                str1Array.add(test);
            };
        }
        
        // 2번 문자열 만들기
        for ( int i = 0; i<str2len-1; i++) {
            String test = Character.toString( str2.charAt(i) ) +Character.toString( str2.charAt(i+1) );
            if (test.matches(Aregex) ) {
                test = test.toUpperCase();
                str2Array.add(test);
            };
        }
        
        ArrayList<String> str10Array = (ArrayList<String>) str1Array.clone();
        ArrayList<String> str20Array = (ArrayList<String>) str2Array.clone();
        
        
        
        for(int i = 0; i<str10Array.size(); i++ ){
            for ( int j=0; j<str20Array.size(); j++){
                if(str10Array.get(i).equals(str20Array.get(j))){
                    str10Array.remove(i);
                    str20Array.remove(j);
                    i--;
                    break;
                } 
            }
        }
        System.out.println("str10Array = " + str10Array.toString());
        System.out.println("str20Array = " + str20Array.toString());
        
        int str1s = str1Array.size(); // A전체
        int str2s = str2Array.size(); // B전체
        int str10s = str10Array.size(); // 빠진거 
        int str20s = str20Array.size(); // 빠진거
        int m = 0;
        int s = str1s-str10s; //분자
        if ( str10s > str20s ){
            s = str1s-str10s; //분자
            m = str10s+str20s+s; //분모

        } else {
            s = str2s-str20s;
            m = str1s+str2s-str2s+str20s; //분모
        }
        
        
        System.out.println("str1s = " + str1s);
        System.out.println("str2s = " + str2s);
        System.out.println("str10s = " + str10s);
        System.out.println("str20s = " + str20s);
        System.out.println("m = " + m);
        System.out.println("s = " + s);
        
        

        
        if ( m==0 && s==0 && str1s==0 && str2s ==0){
            answer = 65536;
        } else if( str2s == 0 ){
            answer = 0;
        } else {
            double abc = (double) s/m;
            answer = (int) Math.floor(abc * 65536);
            
        }
        
        return answer;
    }
}