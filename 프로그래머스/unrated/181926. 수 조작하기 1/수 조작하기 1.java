class Solution {
    public int solution(int n, String control) {
        int answer = n;
        char arr[] = control.toCharArray();
        for(int i = 0 ; i<arr.length; i++ ){
            if ( Character.toString(arr[i]).equals("w")) {
            	answer = answer+1;
            }else if ( Character.toString(arr[i]).equals("s")) {
            	answer = answer-1;
            }else if ( Character.toString(arr[i]).equals("d")) {
            	answer = answer+10;
            }else if ( Character.toString(arr[i]).equals("a")) {
            	answer = answer-10;
            }
        }
        return answer;
    }
}