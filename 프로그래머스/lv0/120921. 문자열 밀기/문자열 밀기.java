class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        String l = "";
        int size = B.length();
        String AA = A.substring(0,A.length());
        if(A.equals(B)){
            answer = 0;
        } else {
            for(int i =0; i<size; i++){
                l = Character.toString(A.charAt(A.length()-1));
                A = l+A;
                A = A.substring(0, A.length()-1);
                if ( A.equals(B) ){
                    answer = i+1;
                    break;
                }
                if ( A.equals(AA)){
                    answer = -1;
                    break;
                }
            }
        }
        
        return answer;
    }
}