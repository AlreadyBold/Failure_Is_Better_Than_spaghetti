import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        // 검증시 필요함
        int cnt = 0;
        // MAP에 넣기
        Map<Object,Integer> map = new TreeMap<Object,Integer>();
        for(int i=0; i<tangerine.length; i++) {
        	if(map.containsKey(tangerine[i])) {
        		map.put(tangerine[i], map.get(tangerine[i])+1);
        	}else {
        		map.put(tangerine[i],1);
        	}
        }
        // MAP VALUE 값 내림차순
        List<Integer> valueSort = new ArrayList(map.keySet());
        Collections.sort(valueSort, (value1, value2) -> (map.get(value2).compareTo(map.get(value1))));
        // System.out.println(map.toString());
        // 검증 
        for(int i =0 ; i<valueSort.size(); i++) {
            cnt = cnt+map.get(valueSort.get(i));
            if ( cnt >= k){
                answer = i+1;
                break;
            }
			//System.out.println("key : " + valueSort.get(i) + " , " + "value : " + map.get(valueSort.get(i)));
		}
        return answer;
    }
}