import java.util.*;
class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int a = 0;
        int b = 0;
        int c = 1;
        for(int i = 1; i<=number; i++){
            for(int j = 1; j<=number; j++){
                if(i%j==0){
                    if( b * j == i && j >1 ){
                        a = a * 2;
                        break;
                    }
                    b = j ;
                    a++;
                }
                
            }
            if( a > limit ){
                answer = answer+ power;
            } else{
                answer = answer+a;
            }
            a = 0;
        }
        return answer;
    }
}