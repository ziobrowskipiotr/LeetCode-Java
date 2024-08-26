//3
class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;
        while(i<s.length()){
            while(j<t.length() && s.charAt(i) != t.charAt(j)){
                j++;
            }
            if(j<t.length()){
                i++;
                j++;
            }
            else{
                break;
            }
        }
        if(i == s.length()){
            return true;
        }
        else{
            return false;
        }
    }
}