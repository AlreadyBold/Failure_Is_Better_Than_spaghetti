import java.util.*;
class Solution {
public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        int fail =100;
        ArrayList<String> arr = new ArrayList();
        if(words[0].length() == 1 ){
            fail = 1;
        } else {
            arr.add(words[0]);
        for(int i = 1; i<words.length; i++){
            if(words[i].length() < 2){
                fail = i+1; 
                break;
            } else if(arr.contains(words[i])) {
            	fail = i+1;
            	break;
            } else if(!(words[i-1].charAt(words[i-1].length()-1) == words[i].charAt(0))) {
            	fail = i+1;
            	break;
            } else {
            	arr.add(words[i]);
            }
        
        }
        }
        if( fail < 100 ){
            if(fail%n == 0 ){
                answer[0] = n;
                answer[1] = fail/n;
            } else {
                answer[0] = fail%n;
                answer[1] = (fail/n) + 1;
            }
        }
        return answer;
    }
}
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        /*int fail = 100;
        // 검증 for
        for(int i = 0; i<words.length-1; i++){
            // 한글자인 경우 
            if(words[i].length()<2){
                fail = i+1;
                break;
            }else {
                // 한글자이거나 같은단어일 경우
                for(int j= i+1; j<words.length; j++){
                    if( words[j].length()<2){
                        fail = j+1;
                        break;
                    } else if (words[i].equals(words[j])) {
                	    fail = j+1;
                        System.out.println("33i = "+ i + " j = "+ j);
                        break;
                    }
                }
            }
        if( fail < 100) break;
        }
        // 이어지지않는 알파벳일 경우 
        for(int i = 0 ; i<words.length-1; i++){
            for(int j=i+1; j<words.length; j++){
                if (j+1 < fail &&j == i+1 && !(words[i].charAt(words[i].length()-1) == words[j].charAt(0))) {
                	fail = j+1;
                    break;
                }
            }
        } */
        // 답 구하기
