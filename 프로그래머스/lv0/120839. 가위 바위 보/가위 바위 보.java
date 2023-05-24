import java.util.stream.Stream;
import java.util.Arrays;
class Solution {
    public String solution(String rsp) {
        String answer = "";
        int[] digits = Stream.of(rsp.split("")).mapToInt(Integer::parseInt).toArray();
        for(int i =0 ; i<digits.length; i++){
            if(digits[i] == 2){
                digits[i] = 0;
            } else if (digits[i] == 0){
                digits[i] = 5;
            } else {
                digits[i] = 2;
            }
        }
        answer = Arrays.toString(digits).replaceAll("[^0-9]","");
        return answer;
    }
}