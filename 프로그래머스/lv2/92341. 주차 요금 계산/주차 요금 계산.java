import java.util.*;
class Solution {
    public int cntpaid (int [] fees , int time){
        // 요금 
        int paid = 0;
        // 단위
        int cnt = 0;
        // 기본시간
        int freetime = fees[0];
        // 기본요금
        int freepaid = fees[1];
        // 단위시간
        int cnttime = fees[2];
        // 단위요금
        int cntpaid = fees[3];
        // 기본시간을 넘지 않았을경우
        if (time <= freetime){
            paid = freepaid;
        // 기본시간을 넘었을 경우 
        } else {
            // 누적시간 - 기본시간 
            time = time - freetime;
            // 누적시간 단위 계산
            cnt = (int) Math.ceil( (double) time / cnttime );
            // 요금계산
            paid = (cnt * cntpaid ) + freepaid;
        }
        return paid;
    }
    
    public int[] solution(int[] fees, String[] records) {
        Map <String,Integer> map1 = new HashMap<>();
        Map <String,Integer> map2 = new HashMap<>();
        
        for ( int i=0; i<records.length; i++ ){
            // 시간 
            int time = Integer.parseInt(records[i].substring(0,2)) * 60 
                + Integer.parseInt(records[i].substring(3,5));
            // 차량번호 
            String carnum = records[i].substring(6,10);
            // 입차 or 출차
            String inout = records[i].substring(11,13);
            // 입차인 경우 
            if ( inout.equals("IN")){
                map1.put(carnum,time);
            // 출차인 경우
            } else {
                // 기존에 한번 입출차 한 경우
                 if( (map2.containsKey(carnum) ) ){
                    map2.put(carnum, map2.get(carnum) + (time - map1.get(carnum)) );
                    map1.remove(carnum);
                // 처음 들어온 경우 
                } else {
                    map2.put(carnum, (time - map1.get(carnum))  );
                    map1.remove(carnum);
                 }
            }
        }
        // 입차 후 출차 안한 경우 검사 
        Iterator<Map.Entry<String, Integer>> itr = map1.entrySet().iterator();
        if(map1.size()>0){
            while(itr.hasNext())
            {   
                Map.Entry<String, Integer> entry = itr.next();
                // 00:00에 입차한 경우 
                if (map2.get(entry.getKey()) == null && map1.get(entry.getKey()) == null ){
                    map2.put(entry.getKey(),1439);
                    //System.out.println(" itr map2 = " +map2);
                } else if ( map2.get(entry.getKey()) == null){
                    map2.put(entry.getKey(), 1439 - map1.get(entry.getKey() )); 
                }else {
                    map2.put(entry.getKey(),map2.get(entry.getKey())-entry.getValue() +1439);
                }
                
            }
        }
        List<String> keySet = new ArrayList<>(map2.keySet());
        // 차량번호로 오름차순 정렬
        Collections.sort(keySet);
        
        int[] answer = new int[map2.size()];
        
        for(int i=0; i<keySet.size(); i++ ){
            answer[i] = cntpaid(fees,map2.get(keySet.get(i)));
        }
        
        return answer;
    }    
}