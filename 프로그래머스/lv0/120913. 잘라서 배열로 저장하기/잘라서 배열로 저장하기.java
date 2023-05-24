class Solution {
        public String[] solution(String my_str, int n) {
        int size = 0;
        if(my_str.length() % n == 0){
            size = my_str.length() / n;
        } else if (my_str.length() % n >= 1){
            size = my_str.length() / n +1;
        }

        String[] answer = new String[size];
            
            
        for( int i = 1 ; i<=answer.length ; i++ ) {
            if( my_str.length()==1 || answer.length == 1 || size == 1){
                answer[0] = my_str;
            }
            if( i * n <= my_str.length() ) {
                answer[i-1] = my_str.substring((i-1)*n,(n*i));
            } if( i * n > my_str.length() ) {
            	answer[size-1] = my_str.substring((i-1)*n);
            }
        }
        return answer;
    }

}