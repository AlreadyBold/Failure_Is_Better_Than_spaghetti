import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) { //4줄생성
		    for (int j = 0; j <=i; j++) {	//빈칸 갯수 만큼 별 출력
			    System.out.print("*");			
		    }
		    System.out.println(); //줄바꿈
	    }
    }
}
        
//         String a ="";
//         for(int i=1; i<=n; i++){
//             if(i > 1) {
//                 a = a + "\r";}

//             for(int j=1; j<=i; j++) {
//             	a = a+"*";
//             }
//         }
//         System.out.println(a);
//     }
