class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        int stack = 0; 
        for(int i = 0; i<dic.length; i++){
            for(int j = 0; j<spell.length; j++){
                if(dic[i].contains(spell[j])) {
                	stack++;
                }
            }
            if(stack == spell.length) {
        	    answer = 1;
        	    break; 
            }
            stack = 0 ;
        }

        return answer;
    }
}