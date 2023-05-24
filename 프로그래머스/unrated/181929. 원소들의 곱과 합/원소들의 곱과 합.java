class Solution {
    public int solution(int[] num_list) {
        int a = 0;
        int b = 1;
        int answer = 0;
        for (int i=0; i<num_list.length; i++){
            a = a+num_list[i];
            b = b*num_list[i];
        }
        if ( a*a > b){
            answer = 1;
        }
        
        return answer;
    }
}