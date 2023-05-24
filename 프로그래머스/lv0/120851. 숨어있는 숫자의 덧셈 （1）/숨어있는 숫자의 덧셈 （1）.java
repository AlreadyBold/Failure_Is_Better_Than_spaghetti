class Solution {
    public int solution(String my_string) {
        String a = "^[0-9]*$";
        int answer = 0;
        for(int i = 0; i<my_string.length(); i++){
            if(String.valueOf(my_string.charAt(i)).matches(a)) {
            	answer = answer+(my_string.charAt(i)-48);
            }
        }
        return answer;
    }
}