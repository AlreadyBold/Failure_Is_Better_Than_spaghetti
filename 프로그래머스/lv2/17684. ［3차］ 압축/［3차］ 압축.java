import java.util.*;
class Solution {
    public int[] solution(String msg) {

        // 사전 추가인덱스
        int index = 27;
        
        // 사전 생성
        Map<String, Integer> map = new HashMap<>();
        
        // 시간 저장
        ArrayList<Integer> array = new ArrayList();
        
        // 사전에 A-Z 저장
        for(int i = 1; i<27; i++ ){
            map.put(Character.toString(64+i),i);
        }
        // 문자열이 1개일때
        if(msg.length() < 2 ) {
            array.add(map.get(msg));
        }else {
        // 검증 시작 
            for(int i=0; i<msg.length()-1; i++ ){
                // 2글자도 없을 때
                if( ( map.get(msg.substring(i,i+2) ) ) == null ){
                    // 사전에 넣기 
                    map.put(msg.substring(i,i+2),index);
                    // 사전 인덱스 
                    index++;
                    // 숫자 넣기 
                    array.add(map.get(msg.substring(i,i+1)));
                    // 2글자 인데 그 끝일 경우
                    if (i >=msg.length()-2){
                        array.add(map.get(msg.substring(i+1)));
                    }
                // 2글자 이상 일 때
                } else {
                    for(int j=i+2; j<msg.length()+1; j++){
                        // 없을 경우 
                        if(map.get(msg.substring(i,j)) == null ){
                            // 사전에 넣기
                            map.put(msg.substring(i,j),index);
                            // 사전 인덱스 
                            index++;
                            // 숫자 넣기
                            array.add(map.get(msg.substring(i,j-1) ));
                            // i값 조정
                            i = j-2;
                            // 마지막 한자리 남을 경우 
                            if( i+2 >= msg.length()){
                                array.add(map.get( msg.substring(i+1) ) );
                            }
                            break;
                        // 있는데 끝일경우
                        } else if ( j >= msg.length() ){
                            array.add(map.get(msg.substring(i,j)));
                            i = msg.length()-1;
                            break;
                        }
                    }
                }
            }
        }
        
        int[] answer = new int[array.size()];
        for(int i = 0; i<array.size(); i++ ){
            answer[i]= array.get(i);
        }
        
        return answer;
    }
}