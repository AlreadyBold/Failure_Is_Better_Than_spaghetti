class Solution {
    public String solution(int a, int b) {
        int answer = 0;
        String[] weeks = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int d = 31;
        for(int i = 1; i<a+1; i++){
            if( a == i){
                d = b;
            } 
            for(int j = 1; j<d+1; j++){
                answer ++;
                if(answer == 8){
                    answer = 1;
                }
            }
            if(i == 1){
                d = 29;
            } else if( i == 3 ||i == 5 ||i == 8 || i == 10 ){
                d = 30;
            } else {
                d = 31;
            }
            if ( i == a && d == b) break;
        }

        return weeks[answer-1];
    }
}