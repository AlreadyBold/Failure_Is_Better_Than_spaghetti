class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        int l = is_prefix.length();
        if ( my_string.length() >= l){
            if ( my_string.subSequence(0, l).equals(is_prefix)){
                answer = 1;
            }
        }

        return answer;
    }
}