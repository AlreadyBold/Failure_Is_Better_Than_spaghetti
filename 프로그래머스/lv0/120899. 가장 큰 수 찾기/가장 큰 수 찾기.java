class Solution {
    public int[] solution(int[] array) {
        
        int maxN = 0;
        int maxI = 0;
        for(int i = 0; i<array.length; i++){
            if (array[i]>maxN){
                maxN = array[i];
                maxI = i;
            }
        }
        int[] answer = {maxN,maxI};
        return answer;
    }
}