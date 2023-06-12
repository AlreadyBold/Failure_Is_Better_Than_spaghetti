class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        int patlen = pat.length();
        int myslen = myString.length();
        for(int i=0; i<myslen-patlen+1; i++){
            if(myString.substring(i,i+patlen).equals(pat)){
                answer++;
            }
        }
        return answer;
    }
}