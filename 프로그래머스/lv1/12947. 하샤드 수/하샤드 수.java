import java.util.ArrayList;
class Solution {
    public boolean solution(int x) {
            String a = Integer.toString(x);
            int sum = 0;
            ArrayList<Integer> array = new ArrayList<Integer>();
            boolean answer = true;
            for(int i= 0; i<a.length(); i++){
                array.add((int)a.charAt(i)-48);
            }
            for (int i = 0; i<array.size(); i++) {
                sum = sum + array.get(i);
            }
            System.out.println(sum);
            if ( x % sum  == 0) {
            	answer = true;
            } else {
            	answer = false;
            }
            
        return answer;
    }
}