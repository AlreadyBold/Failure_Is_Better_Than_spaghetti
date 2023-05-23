import java.util.*;
class Solution {
    public int solution( int k, int m, int[] score) {
        int sl = score.length;
    	int answer = 0;
        int count = 0;
        int sum = 0;
        // k = 최대점수 , m = 과일의 갯수
        Arrays.sort(score);
        if(m % sl == 0) {
            for(int i = 0; i<sl; i+=m){
                answer = answer + (score[i] * m);
            } 
        }else{
            for(int i = sl%m ; i<sl; i+=m){
                answer = answer + (score[i] * m);
            } 
        }
    	return answer;
    }
}