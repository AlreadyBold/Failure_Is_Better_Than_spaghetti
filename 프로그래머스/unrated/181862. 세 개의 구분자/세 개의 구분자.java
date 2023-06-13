import java.util.*;
class Solution {
    public String[] solution(String myStr) {
        // 왜이리 어렵게 풀지 ? 머리가 바보인가봐
        String myStrClone = myStr;
        String count = "";
        myStr = myStr.replace("a","-");
        myStr = myStr.replace("b","-");
        myStr = myStr.replace("c","-");
        ArrayList<String> arr = new ArrayList();
        if ( myStr.equals(myStrClone) ) {
            String[] answer = new String[0];
            answer[0] = myStr;
            return answer;
        } else {
            for(int i = 0; i<myStr.length(); i++ ){
                if(Character.toString(myStr.charAt(i)).equals("-") ){
                    if ( !(count.equals("")) ){
                        arr.add(count);
                        count = "";
                    }
                } else {
                    count = count + Character.toString(myStr.charAt(i));
                }
                if ( i+1 == myStr.length() && !(count == null) ){
                    arr.add(count);
                }
            }
        String[] answer = new String[arr.size()];
        if(arr.size()==1 && arr.get(0).equals("")){
            answer[0] = "EMPTY";
        } else {
            for(int i = 0; i<arr.size(); i++ ){
                answer[i] = arr.get(i);
            }
        }
            return answer;
        }        
    }
}