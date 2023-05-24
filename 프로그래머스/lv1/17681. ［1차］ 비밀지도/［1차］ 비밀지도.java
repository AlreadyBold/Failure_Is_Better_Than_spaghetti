class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] ar1 = new String[n];
        String[] ar2 = new String[n];
        String[] answer = new String[n];
        String binary = "";
        for(int i=0; i<arr1.length; i++) {
        	binary = Integer.toBinaryString(arr1[i]);
            if(binary.length()<n){
                for(int j = binary.length(); j<n ; j++){
                    binary = "0"+binary;
                }
            }
            ar1[i] = binary;
        }
        
        for(int i=0; i<arr2.length; i++) {
        	binary = Integer.toBinaryString(arr2[i]);
            if(binary.length()<n){
                for(int j =binary.length(); j<n ; j++){
                    binary = "0"+binary;
                }
            }
            ar2[i] = binary;
        }
        
        for(int i=0; i<answer.length; i++ ){
            char[] val1 = ar1[i].toCharArray();
            char[] val2 = ar2[i].toCharArray();
            for(int j = 0 ; j< ar1.length; j++ ){
                if( Character.toString(val1[j]).equals("1") || Character.toString(val2[j]).equals("1")){
                    answer[i] = answer[i]+"#";
                } else {
                    answer[i] = answer[i]+" ";
                }
                answer[i] = answer[i].replace("null","");
            }
        }
        return answer;
    }
}