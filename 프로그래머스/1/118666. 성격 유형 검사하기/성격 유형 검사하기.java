import java.util.*;
class Solution {
    public String solution(String[] survey, int[] choices) {
       String answer = "";
        Map<String, Integer> mbti = new HashMap();
        
        for(int i = 0; i< survey.length; i++){
            // 점수
            int points = 4-choices[i];
            // 맵에 저장
            char [] testQuestion = survey[i].toCharArray();
            if ( points < 0 ){
                if( mbti.containsKey(String.valueOf(testQuestion[1]))){
                    mbti.put(String.valueOf(testQuestion[1]),Math.abs(points) + mbti.get(String.valueOf(testQuestion[1]))); 
                } else {
                    mbti.put(String.valueOf(testQuestion[1]),Math.abs(points));
                }
            } else if ( points > 0) {
                if( mbti.containsKey(String.valueOf(testQuestion[0]))){
                    mbti.put(String.valueOf(testQuestion[0]),Math.abs(points) + mbti.get(String.valueOf(testQuestion[0])));  
                } else {
                    mbti.put(String.valueOf(testQuestion[0]),Math.abs(points));
                }
            }
        }
        answer = vs("R", "T", mbti);
        answer = answer+vs("C", "F", mbti);
        answer = answer+vs("J","M",mbti);
        answer = answer+vs("A","N",mbti);
        
        return answer;
    }
    

    public String vs (String a, String b,Map<String, Integer> mbti){
        if(mbti.get(a)!=null&&mbti.get(b)!=null){
            if (mbti.get(a)>=mbti.get(b)){
                return a;
            } else {
                return b;
            }
        } else {
            if (mbti.get(b)!=null) {
                return b;
            } else return a;
        }
    }
    
    
}