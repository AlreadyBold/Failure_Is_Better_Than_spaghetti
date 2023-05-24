class Solution {
    public double solution(int[] arr) {
        int arrl = arr.length;
        double answer = 0;
        for (int i = 0 ; i< arr.length; i++){
            answer = answer + arr[i];
        }
        answer = answer / arrl ;
        return answer;
    }
}