class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int ab = Integer.parseInt( (Integer.toString(a) + Integer.toString(b)) );
        int abab = 2*a*b;
        if ( ab > abab ){
            answer = ab;
        } else {
            answer = abab;
        }
        return answer;
    }
}