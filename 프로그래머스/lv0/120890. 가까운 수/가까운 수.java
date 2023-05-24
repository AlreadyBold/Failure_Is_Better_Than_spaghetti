class Solution {
   public int solution(int[] array, int n) {
	        int a = 1000;
	        int answer = 0;
	        if(array.length == 1 ){
                answer = array[0];
            } else {
                for(int i = 0 ; i<array.length; i++ ){
                    if(Math.abs(array[i]-n) < a){
                        a = Math.abs(array[i]-n);
                        answer = array[i];
                    }else if(Math.abs(array[i]-n) == a) {
                        if(array[i] < answer){
                            answer = array[i];
                        }
                    }
                }
            }
	        return answer;
	    }
}