//1
class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length()-1;
        while(i<j){
            while(!Character.isLetterOrDigit(s.charAt(i)) && i<j){
                i++;
            }
            while(!Character.isLetterOrDigit(s.charAt(j)) && i<j){
                j--;
            }
            if(s.charAt(i) != s.charAt(j) && 
            (Character.toLowerCase(s.charAt(i)) != s.charAt(j) && 
            Character.toLowerCase(s.charAt(j)) != s.charAt(i))){
                return false;
            }
            else{
                i++;
                j--;
            }
        }
        return true;
    }
}
