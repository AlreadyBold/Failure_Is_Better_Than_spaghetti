class Solution {
    public int solution(int[] numbers, int k) {
        
        /* 개 10 구데기 코드 ㅋㅋ
        for(int i=0, j=0; i<k; i++){
            if( i+1 == k ){
                answer = numbers[j];
                break;
            }
            if(j+2 == numbers.length){
                j=0;
            } else if(j+1 == numbers.length){
                j=1;
            } else {
                j=+2;
            }
        } */
        return numbers[(2 * (k-1)) % numbers.length];
    }
}