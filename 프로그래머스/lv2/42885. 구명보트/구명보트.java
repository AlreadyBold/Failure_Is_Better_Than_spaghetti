import java.util.*;
class Solution {
    public int solution(int[] people, int limit) {
        // 정렬 후 int[len] + int[0+i] for문으로 cnt++;
        // 경우의 수 정리 -> 1. valid =0 인경우 / 2. i - valid = 홀수 / 3. i - valid = 짝수 / 4.
        int answer = 0;
        int cnt = 0;
        int len = people.length-1;
        Arrays.sort(people);
        //System.out.println(Arrays.toString(people));
        // 반복문시작
        for(int i=len; i>0; i--){
            // 한쌍 남았을때 검증
            if(i-cnt==1 ){
                //System.out.println("A");
                if(people[i] + people[cnt] > limit){
                    answer=answer+2;
                    break;
                } else{
                    answer++;
                    break;
                }
                // limit 보다 클때
            } else if(people[i] + people[cnt] > limit){
                //System.out.println("B");
                answer++;
                continue;
                // limit 보다 작을때 
            } else{
                //System.out.println("C  i = "+i+" cnt = "+cnt);
                answer++;
                cnt++;
                
            }
            // 마지막일때 
            if(i-cnt == 1) {
                answer ++;
                break;
            }
            //System.out.println("i = "+ i+" cnt = "+cnt);
           
            
            
        }
        
        
        return answer;
    }
}