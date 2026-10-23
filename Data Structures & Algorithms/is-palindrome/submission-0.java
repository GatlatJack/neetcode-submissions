class Solution {
    public boolean isPalindrome(String s) {
        String t = "";
        int n = s.length()-1;
        for(int i = n; i >= 0; i--){
            if(Character.isLetterOrDigit(s.charAt(i))){
                t+=s.charAt(i);
            }
        }
        
        String result = "";
        for(int i  = 0; i < s.length(); i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                result+=s.charAt(i);
            }
        }

        return t.equalsIgnoreCase(result);
    }
    


}
