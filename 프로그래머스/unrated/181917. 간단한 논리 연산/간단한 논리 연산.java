class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = false;
        String a = "T";
        String b = "T";
        if(x1 == false && x2 == false) a = "F";
        if(x3 == false && x4 == false) a = "F";
        if( a.equals("T") && b.equals("T")) answer = true;
        
        return answer;
    }
}