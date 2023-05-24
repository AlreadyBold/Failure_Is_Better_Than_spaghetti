class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int before = 0;
        int after = 0;
        for(int i = 0; i<10000; i++){
            if(s.equals("1")){
                break;
            }else{
            before = s.length();
            s = s.replaceAll("0","");
            after = s.length();
            s = Integer.toBinaryString(after);
            answer[0] ++;
            answer[1] = answer[1]+ before - after;
            }
        }
        
        return answer;
    }
}