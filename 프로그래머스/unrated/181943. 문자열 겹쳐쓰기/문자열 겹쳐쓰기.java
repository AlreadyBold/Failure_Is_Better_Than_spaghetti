class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        answer = my_string.substring(0,s);
        System.out.println(answer);
        answer = answer+overwrite_string;
        System.out.println(answer);
        if ( answer.length()< my_string.length()){
            
            answer = answer + my_string.substring(answer.length(), my_string.length());
            System.out.println(answer);
        }
        return answer;
    }
}