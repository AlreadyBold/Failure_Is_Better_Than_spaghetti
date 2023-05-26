import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String answer = "";
        for ( int i=0; i<a.length(); i++ ){
            if ( a.charAt(i) > 91){
                answer = answer + Character.toString(a.charAt(i)).toUpperCase();
            } else {
                answer = answer + Character.toString(a.charAt(i)).toLowerCase();
            }
        }
        System.out.println(answer);

    }
}