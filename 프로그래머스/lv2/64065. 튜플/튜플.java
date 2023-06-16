import java.util.*;
class Solution {
    public int[] solution(String s) {
        // 앞뒤 괄호 제거 
        s = s.replace("{{","");
        s = s.replace("}}","");
        // 문자열 나누기 
        String [] arr1 = s.split("\\},\\{");
        Map<String,Integer> map = new HashMap<>();
        // Map에 저장
        for(int i = 0 ; i<arr1.length; i++ ){
        	// 2개이상의 원소일때 
            if ( arr1[i].contains(",")){
                // 문자열 나누기 
                String[] arr2 = arr1[i].split(",");
                for(int j = 0; j<arr2.length; j++) {
                    // 혹시모를 공백 제거 
                    arr2[j] = arr2[j].replaceAll(" ","");
                    // 맵에 이미 저장되어 있는 경우 
                    if(map.containsKey(arr2[j])){
                        map.put(arr2[j], map.get(arr2[j])+1);
                    // 맵에 저장 안되어 있는 경우
                    } else {
                        map.put(arr2[j],1);
                    }
                }
            // 원소가 1개일때
            } else {
                // 맵에 이미 저장되어 있는 경우 
                if( map.containsKey(arr1[i]) ){
                    map.put(arr1[i], map.get(arr1[i])+1);
                // 맵에 저장 안되어 있는 경우
                } else {
                    map.put(arr1[i],1);
                }
            }
        }
        // List만들어서 내림차순 정렬 
        List<String> keys = new ArrayList<>(map.keySet());
		Collections.sort(keys, (v1, v2) -> (map.get(v2).compareTo(map.get(v1)))); 
		// 오름차순은 compareTo 에서 v1, v2 위치 변경
        int[] answer = new int [keys.size()];
		for (int i = 0; i<keys.size(); i++) {
			answer[i] = Integer.parseInt(keys.get(i));
		}
        
        return answer;
    }
}