import java.util.*;
class Solution {
    public Object[] solution(String today, String[] terms, String[] privacies) {
		int[] answer = {};
		ArrayList<Integer> arr = new ArrayList();
        Map <String, Integer> term = new HashMap<String, Integer>();
        //2000 년 이후 날짜계산
        int todays = (today.charAt(2)-48) * 3360 + (today.charAt(3)-48)*336 + (today.charAt(5)-48)*280 + 
            (today.charAt(6)-48)*28 + (today.charAt(8)-48)*10 + (today.charAt(9)-48);
        //map에 terms 저장
        for(int i = 0; i<terms.length; i++){
            String[] t = terms[i].split(" ");
            term.put(t[0],Integer.parseInt(t[1]));
        }
        //sum 과 todays로 검증
        for(int i = 0; i<privacies.length; i++){
        	int sum = 0; 
            sum = (privacies[i].charAt(2)-48) * 3360 + (privacies[i].charAt(3)-48)*336 + (privacies[i].charAt(5)-48)*280 + 
                (privacies[i].charAt(6)-48)*28 + (privacies[i].charAt(8)-48)*10 + (privacies[i].charAt(9)-48) ;
            sum = sum+ term.get(Character.toString(privacies[i].charAt(privacies[i].length()-1))) * 28;
           
            if(sum<=todays) {
            	arr.add(i+1);
            }
        }
        return arr.toArray();
    }
}