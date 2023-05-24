class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        String abc = "";
        int tl = t.length();
        int pl = p.length();
        int tmp = tl - pl + 1;
        for(int i = 0; i<tmp; i++){
            for(int j = 0; j<pl; j++ ){
                abc = abc + Character.toString(t.charAt(i+j));
                if( abc.length() == pl){
                    if(Long.parseLong(abc) <= Long.parseLong(p)){
                        answer++;
                        abc ="";
                    }
                    abc ="";
                }
            } 
        } 
        return answer;
    }
}