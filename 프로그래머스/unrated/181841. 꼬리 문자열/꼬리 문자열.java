class Solution {
    public String solution(String[] str_list, String ex) {
        String answer = "";
        int len = str_list.length;
        for (int i =0 ; i<len; i++ ){
            if( ! (str_list[i].contains(ex) )){
                answer = answer+str_list[i];
            }
        }
        return answer;
    }
}