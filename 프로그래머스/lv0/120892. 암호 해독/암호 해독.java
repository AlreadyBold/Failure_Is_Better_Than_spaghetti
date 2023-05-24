class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        for(int i = 1; i*code<=cipher.length(); i++){
            char k = cipher.charAt((i*code)-1);
            answer = answer+ Character.toString(k);
            k = ' ';

        }
        return answer;

    }
}