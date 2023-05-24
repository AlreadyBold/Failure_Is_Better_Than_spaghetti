class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int len = num_list.length;
        int a = 0;
        int b = 0;
        for(int i=1; i<=len; i++ ){
            if ( i % 2 == 0 ) {
                b = b+num_list[i-1];
            } else {
                a = a+num_list[i-1];
            }
        }
        
        if ( a >= b) {
            return a;
        } else return b;
    }
}