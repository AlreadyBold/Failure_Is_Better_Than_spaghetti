import java.util.Arrays;
class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        // answer = new int[num2];
        // for(int i=0; i< num2; i++){
        //     answer[i] = numbers[i+num1];
        //     System.out.println("answer["+i+"] 번째 = "+ answer[i]);
        //     System.out.println("number["+(i+num1)+"] 번째 = "+ numbers[i+num1]);
        // }
        
        
        int[] answer = Arrays.copyOfRange(numbers,num1,num2+1);
        return answer;
    }
}