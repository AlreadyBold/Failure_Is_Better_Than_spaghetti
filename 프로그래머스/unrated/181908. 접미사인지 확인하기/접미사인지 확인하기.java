class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        int mlen = my_string.length();
        int ilen = is_suffix.length();
        if ( mlen >= ilen ){
            System.out.println(my_string.substring(mlen-ilen));
            if ( is_suffix.equals(my_string.substring(mlen-ilen) ) ){
                answer = 1;
            }
        }
        return answer;
    }
}