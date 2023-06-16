import java.util.*;
class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        Set<Integer> treeset = new TreeSet<>();
        int cnt = 0;
        int sum = 0;
        int alm = 0;
        for(int i=0; i<elements.length; i++){
            sum = elements[i];
            alm = alm + elements[i];
            treeset.add(sum);
            if(i == elements.length-1 ){
                cnt = 0;
                treeset.add(alm);
            } else {
                cnt = i+1;
            }

            // set에 저장하고 sum에 저장해서 다음거만 더해서 저장
            for(int j=0; j<elements.length-2; j++){
                sum=sum+elements[cnt];
                // System.out.println(" i = "+ i + " j = "+ j+ " cnt = "+ cnt+ " sum = "+ sum);
                treeset.add(sum);
                cnt++;
                if (cnt == elements.length) {
                    cnt = 0;
                }
            }
        }
        //System.out.println(treeset);
        
        return treeset.size();
    }
}