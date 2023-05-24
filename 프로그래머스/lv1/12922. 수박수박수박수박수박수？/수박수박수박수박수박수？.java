class Solution {
    public String solution(int n) {
        String str = "수박";
        String answer = "";
        if(n%2 == 0) {
            answer = str.repeat(n/2);
        } else if (n%2 == 1){
            answer = str.repeat(n/2) + "수";
        }


        return answer;
    }
}