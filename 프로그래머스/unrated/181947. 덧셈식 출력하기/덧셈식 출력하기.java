import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String abc = a + " + " + b + " = "+ Integer.toString(a+b);
        System.out.println(abc);
    }
}