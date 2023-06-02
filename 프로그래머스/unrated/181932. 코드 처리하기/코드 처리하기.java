class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0;
        for(int i=0; i<code.length();i++){
            // 모드변경 
            if(code.charAt(i) == 49){
                if(mode == 1){
                    mode = 0;
                } else {
                    mode = 1;
                }
                continue;
            // 모드 1 일때
            } else if(mode == 1){
                if(i%2 == 1) {
                    answer = answer+Character.toString(code.charAt(i));
                }
            // 모드 0 일때 
            } else {
                if(i%2 == 0 ){
                    answer = answer+Character.toString(code.charAt(i));
                }
            }
        }
        if( answer.equals("") ){
            return "EMPTY";
        } else {
            return answer;
        }
    }
}