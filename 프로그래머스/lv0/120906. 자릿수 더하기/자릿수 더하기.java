class Solution {
    public int solution(int n) {
        int answer = 0;
        answer = answer+n/1000000;
        n = n-((n/1000000)*1000000);
        answer = answer+n/100000;
        n = n-((n/100000)*100000);
        answer = answer+n/10000;
        n = n-((n/10000)*10000);
        answer = answer+(n/1000);
        n = n-((n/1000)*1000);
        answer = answer+n/100;
                n = n-((n/100)*100);
        answer = answer+n/10;
                n = n-((n/10)*10);
        answer = answer+n;
        return answer;
    }
}