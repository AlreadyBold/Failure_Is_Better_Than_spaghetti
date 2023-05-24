import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        int pl = numbers[numbers.length-1] * numbers[numbers.length -2];
        int mi = numbers[0] * numbers[1];
        if(pl<mi){
            answer = mi;
        } else if (pl>mi){
            answer = pl;
        } else {
            answer = pl;
        }
        
        System.out.println(Arrays.toString(numbers));
        return answer;
    }
}