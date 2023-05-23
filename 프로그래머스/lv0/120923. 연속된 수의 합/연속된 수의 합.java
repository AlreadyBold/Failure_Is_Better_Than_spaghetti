import java.util.ArrayList;
class Solution {
    public int[] solution(int num, int total) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int a = 0;
        for(int i = -99 ; i<100; i++){
            for(int j=1; j<=num;j++){
                int k = j+i;
                a = a+k;
            }
            if(a == total) {
                for(int c = 1 ; c<= num; c++){
                    list.add(i+c);
                }
            }
            if(a == total)break;
            a = 0;
        }
        int[] answer = new int[list.size()];
        int size=0;
        for(int temp : list){
            answer[size++] = temp;
        }
        return answer;
    }
}