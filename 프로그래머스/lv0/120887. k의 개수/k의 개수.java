class Solution {
		public int solution(int i, int j, int k) {
        int answer = 0;

        for(int a= i ; a<=j; a++) {
            if( a/10 >= 1 ){
            	if(Integer.toString(a).contains(Integer.toString(k)) == true) {
            		for (int t = 0; t < Integer.toString(a).length(); t++) {
                        if (Integer.toString(a).charAt(t) ==  Integer.toString(k).charAt(0)) {
                            answer++;
                        }
            	    }
            	}
               
            }else{
                if(a == k){
                    answer++;
                }
            }
        }
        return answer;
	}
}