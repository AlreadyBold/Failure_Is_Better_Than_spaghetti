class Solution {
    public int[] solution(int[] arr) {
        int answerlen = 0;
        for(int i=0; i<11; i++){
            if ( Math.pow(2,i) >=arr.length){
                answerlen = (int) Math.pow(2,i);
                    break;
            }
        }
        int[] answer = new int[answerlen];
        if( answerlen == arr.length ){
            answer = arr.clone();
        } else {

            for(int i = 0 ; i<arr.length; i++ ){
                answer[i] = arr[i];
            }
        }
        return answer;
    }
}