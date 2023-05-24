class Solution {
    public String solution(String phone_number) {
        int a = phone_number.length();
        StringBuilder sb = new StringBuilder(phone_number);
        for (int i = 0 ; i<a-4; i++){
            sb.setCharAt(i,'*');
        }
        return sb.toString();
    }
}