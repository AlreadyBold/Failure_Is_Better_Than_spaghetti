class Solution {
    public String solution(String my_string, int num1, int num2) {
        char k = my_string.charAt(num1);
        char j = my_string.charAt(num2);
        System.out.println(Character.toString(k));
        System.out.println(Character.toString(j));
        StringBuffer sb = new StringBuffer();
        sb.append(my_string);
        
        
        sb = sb.replace(num2,num2+1,Character.toString(k));
        
        System.out.println(sb);
        
        sb = sb.replace(num1,num1+1, Character.toString(j));
        
        

        return sb.toString();
    }
}