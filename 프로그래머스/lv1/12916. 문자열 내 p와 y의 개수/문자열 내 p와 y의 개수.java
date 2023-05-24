class Solution {
    boolean solution(String s) {
          boolean answer = true;
	        int p = 0;
	        int y = 0;
	        String[] list = s.split("");
	        for(int i = 0; i<list.length; i++){
	        	if(list[i].equals("p") || list[i].equals("P")) {
	        		p++;
	        	} else if(list[i].equals("y") || list[i].equals("Y")) {
	        		y++;
	        	}
	        }
	        if (p == y) {
	        	answer =true;
	        } else {
	        	answer=false;
	        }
	        return answer;
    }
}