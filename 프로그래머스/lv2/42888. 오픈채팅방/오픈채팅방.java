import java.util.*;
class Solution {
    public String[] solution(String[] record) {
        Map <String, String> map = new HashMap<>();
        List <String> list = new ArrayList();
        for(int i = 0; i<record.length; i++ ){
            String[] arr = record[i].split(" ");
            // arr[0] = status / arr[1] = userid / arr[2] = nickname
            if( arr[0].equals("Enter") ){
                list.add(arr[1]+"-님이 들어왔습니다.");
                map.put(arr[1],arr[2]);
            } else if ( arr[0].equals("Leave") ) {
                list.add(arr[1]+"-님이 나갔습니다.");
            } else {
                map.put(arr[1],arr[2]);
            }   
        }
        
        
        //System.out.println( "map = "+ map);
        //System.out.println( "List = "+ list);
        String[] answer = new String[list.size()];
        for(int i = 0; i<list.size(); i++ ){
            // 아이디가 1 ~ 10자리임
            String [] arr = list.get(i).split("-");
            answer[i] = map.get(arr[0])+arr[1];
        }
        
        return answer;
    }
}