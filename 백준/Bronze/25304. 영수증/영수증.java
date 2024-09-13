import java.util.*;
public class Main {
    public static void main(String[] args) {
        
        /*// 스캐너 불러오기
        Scanner sc = new Scanner(System.in);
        // 영수증의 총 가격
        int total =  sc.nextInt();
        // 물건 종류
        int count = sc.nextInt();
        // 실제 물건 개수 * 가격
        int priceTotal = 0;
        // 물건 종류 만큼 for문
        for(int i = 0; i< count; i++){
            // 물건 가격 받아오기
            int price = sc.nextInt();
            // 물건 수량 받아오기
            int num = sc.nextInt();
            // 물건 수량 * 가격 을 저장
            priceTotal = priceTotal + (price * num);
        }
        // 영수증의 총 가격과 실제 물건개수 * 가격이 맞을경우
        if(total == priceTotal) {
            System.out.println("YES");
        // 틀릴 경우
        } else {
            System.out.println("No");
        }*/
        Scanner sc = new Scanner(System.in);

        int total =  sc.nextInt();
        int count = sc.nextInt();

        for(int i = 0; i< count; i++){
            int price = sc.nextInt();
            int num = sc.nextInt();

            total = total - (price * num);
        }

        if(total == 0) System.out.println("Yes");
        else System.out.println("No");

    }
}
