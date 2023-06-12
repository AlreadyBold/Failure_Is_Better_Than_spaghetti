class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        answer = answer+ my_string.substring(0,s);
        for(int i = e; i>s-1; i--){
            answer = answer + Character.toString(my_string.charAt(i));
        }
        answer = answer+my_string.substring(e+1);
        return answer;
    }
}