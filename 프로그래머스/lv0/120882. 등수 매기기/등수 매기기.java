import java.util.*;
class Solution {
   public int[] solution(int[][] score) {
		 int[] answer = new int[score.length];
	        double[] avg = new double [score.length];
	        int rank = score.length;
	        Map<Integer,Double> map = new HashMap<Integer,Double>();
         for(int i =0; i<score.length; i++ ){
	            avg[i] = (double) (score[i][0]+score[i][1]) / 2;
	        }
	        Arrays.sort(avg);
	        for(int i =0; i<score.length; i++ ){
	           map.put(avg.length-i, avg[i]);
	        }
	        System.out.println(map);
         for(int i=0; i<answer.length; i++){
        	 Double ss = (double) ( score[i][0] + score[i][1] ) / 2;
             answer[i] = getKey(map,ss);
         }
	        
	        // 	{65.0=3, 70.0=2, 75.0=1, 55.0=4}
	        return answer;
	    }
    public static <K, V> K getKey(Map<K, V> map, V value) {
        // 찾을 hashmap 과 주어진 단서 value
        for (K key : map.keySet()) {
            if (value.equals(map.get(key))) {
                return key;
            }
        }
        return null;
    }
    
}
