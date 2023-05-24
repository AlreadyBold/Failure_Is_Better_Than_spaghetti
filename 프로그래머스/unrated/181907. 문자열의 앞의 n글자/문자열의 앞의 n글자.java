class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        answer = (String) my_string.subSequence(0,n);
        return answer;
    }
}