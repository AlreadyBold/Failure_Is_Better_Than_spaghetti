
class Solution {
    public int[] solution(long n) {
       String a = Long.toString(n);
        char [] arr = a.toCharArray();
        int[] answer = new int[arr.length];
        for(int i=0 ,j=arr.length-1; i<arr.length; i++,j--) {
        	answer[i] = arr[j]-48;
        }
        return answer;

    }
}