class Solution {
    public int lengthOfLastWord(String s) {
        int i = s.length()-1;
        int j = s.length()-1;
        while(i>0){
            if(!Character.isLetterOrDigit(s.charAt(i))){
                i--;
                j--;
            }
            else{
                while(Character.isLetterOrDigit(s.charAt(i))){
                    i--;
                }
                break;
            }
        }
        return j-i;
    }
}