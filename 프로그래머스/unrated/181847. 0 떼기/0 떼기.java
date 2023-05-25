class Solution {
    public String solution(String n_str) {
        String answer = "";
        int len = n_str.length();
        for ( int i = 0; i<n_str.length(); i++ ){
            if ( n_str.charAt(i) == 48){
                n_str = n_str.replaceFirst("0","");
                i--;
            } else {
                answer = n_str;
                break;
            }
            
        }
        return answer;
    }
}