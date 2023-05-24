import java.util.*;
import java.util.stream.Stream;
class Solution {
    public String solution(int age) {
        String answer = "";
        int[] array = Stream.of(String.valueOf(age).split("")).mapToInt(Integer::parseInt).toArray();
        for( int i = 0 ; i<array.length; i++){
            answer = answer + Character.toString(array[i]+97);
        }
        return answer ;
    }
}