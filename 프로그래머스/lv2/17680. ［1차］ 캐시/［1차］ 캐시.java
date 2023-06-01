import java.util.*;
class Solution {
    public int solution(int cacheSize, String[] cities) {
        // 1. 어딘가에 있으면 삭제 후 배열 순서 왼쪽으로 한칸씩 밀고 끝에 새로 넣기 ( + 1 )
        // 2. 어딘가에 없으면 [0]번 삭제 후 배열 순서 왼쪽으로 한칸씩 밀고 끝에 새로 넣기 ( + 5 )
        // 큐를 쓸지 배열을 쓸지 ..? 
        // 흠 
        int answer = 0;
        String[] arr = new String[cacheSize];
        int len = cities.length;
        // 큐사용
        Queue<String> que = new LinkedList();
        if (cacheSize == 0 ){
            answer = len*5;
        }
        else {
            for(int i=0; i<len; i++){
                if (que.contains(cities[i].toUpperCase())){
                   que.remove(cities[i].toUpperCase());
                   que.add(cities[i].toUpperCase());
                   answer++;
                } else if(que.size()<cacheSize) { 
                    que.add(cities[i].toUpperCase());
                    answer=answer+5;
                } else {
                	que.poll();
                	que.add(cities[i].toUpperCase());
                	answer=answer+5;
                }
                    
            }
        }
        
        
        
        
        
        
        
        
        /*
        배열사용
        int len = cities.length-1;
        for(int i = 0; i<len; i++){
            for(int j=0; j<cacheSize; j++){
                if(arr[j].equals(cities[i])){
                    answer++;
                    break;
                }
                if()
            }
        }*/

        
        
        
        
        
        
        return answer;
    }
}