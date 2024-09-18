import java.util.*;
public class Main {
    public static void main(String[] args) {
        
        // 스캐너 불러오기
        Scanner sc = new Scanner(System.in);
        // 영수증의 총 가격
        int total =  sc.nextInt();
        // 물건 종류
        int count = sc.nextInt();
        // 실제 물건개수 * 가격 ( 총합 )
        int sum = 0;
        // 물건 종류 만큼 for문
        for(int i = 0; i< count; i++){
            // 물건 가격 받아오기
            int price = sc.nextInt();
            // 물건 수량 받아오기
            int num = sc.nextInt();
            // 물건 수량 * 가격을 더하기
            sum = sum + (price * num);
        }
        // 영수증의 총 가격과 실제 물건개수 * 가격이 맞을경우
        if(sum == total) {
            System.out.println("Yes");
        // 틀릴 경우
        } else {
            System.out.println("No");
        }
    }
}