class Solution {
    public int solution(int n) {
        int answer = 0;
        int aa = (Integer.toBinaryString(n)).replace("0","").length();
        int bb = 0;
        
        for ( int i=n+1; i<1000000; i++ ){
            bb = (Integer.toBinaryString(i)).replace("0","").length();
            if ( bb == aa ){
                answer = i;
                break;
            }
        }
        
        String a = Integer.toBinaryString(n);
        return answer;
    }
}