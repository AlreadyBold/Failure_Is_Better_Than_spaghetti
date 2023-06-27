import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        int cnt = 0;
        int k = 0;
        // 원하는 항목 넣기 
        HashMap<String,Integer> map1 = new HashMap<>();
        for(int i =0; i<want.length; i++ ){
            map1.put(want[i],number[i]);
        }
        
        // 검사 
        for(int i = 0; i<discount.length-9; i++) {
            HashMap<String,Integer> map = new HashMap<>();
            for(int j=i; j<i+10; j++ ){
                if ( ! ( map.get(discount[j]) == null)){
                    map.put(discount[j], map.get(discount[j])+1);
                } else {
                    map.put(discount[j], 1);
                }
                
            }
            if(map.equals(map1)){
                answer++;
            } 
        }
        // 할인하는 제품은 하루에 하나씩만 구매할 수 있습니다 
        return answer;
    }
}