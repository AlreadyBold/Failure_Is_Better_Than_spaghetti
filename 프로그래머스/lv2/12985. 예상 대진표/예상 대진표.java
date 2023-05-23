class Solution
{
    public int solution(int n, int a, int b)
    {   
        int K = 1;
        int answer = 0;
        // 최종 라운드 수 구하기
        for ( int i =1; i<=20 ; i++){
            if( n/2 > 1){
                n = n/2;
                K= K+1;
            }
        }
            System.out.println("라운드수는 총"+ K) ;
        for( int i = 1; i< K+1 ; i++){
            if(Math.abs(a-b )== 1 ){
                answer = i;
            }
            if(a%2 == 1 ){
                a= (a/2)+1;
            }else{
                a= (a/2);
            }
            if(b%2 == 1 ){
                b= (b/2)+1;
            }else{
                b= (b/2);
            }
            System.out.println(i+"번째가 끝난 후 a = "+ a + "  b = "+b) ;
        }
        return answer;
    }
}