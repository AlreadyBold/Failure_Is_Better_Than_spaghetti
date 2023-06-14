import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] cnt = new int[progresses.length];
        // 소요시간 정리
        for(int i=0; i<cnt.length; i++){
            for(int j=1; j<100; j++){
                progresses[i] = progresses[i] + speeds[i];
                if(progresses[i] >= 100 ){
                    cnt[i] = j;
                    break;
                }
            }
        }
        // 기능개발일정 저장 리스트
        List<Integer> list = new ArrayList();
        // 배포가능 기능갯수 count
        int count = 1;
        for(int i=0; i<cnt.length; i++) {
            // 마지막 1개의 경우의 수
            if ( i+1 == cnt.length ){
                list.add(1);
                break;
            }
            // 비교
        	for(int j=i+1; j<cnt.length; j++ ) {
                // 숫자가 클경우
        		if( cnt[i] >= cnt[j]){
                    count++;
                    // 숫자가 크지만 비교대상이 마지막일 경우
                    if ( j+1 == cnt.length ){
                        list.add(count);
                        i = cnt.length-1;
                        break;
                    }
                    continue;
                    // 숫자가 작을경우
                } else if ( cnt[i] < cnt[j]) {
                    list.add(count);
                    i = j-1;
                    count=1;
                    break;
                } 
        	}
        }
        // 배열로 변환
        int[] answer = new int[list.size()];
        for(int i = 0 ; i<list.size(); i++ ){
            answer[i] = list.get(i);
        }
        return answer;
    }
}