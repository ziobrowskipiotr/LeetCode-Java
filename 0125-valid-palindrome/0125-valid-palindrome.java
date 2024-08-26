class Solution {
    ArrayList<Character> result = new ArrayList<>();
    public boolean isPalindrome(String s) {
        for(int i=0; i<s.length(); i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                if(Character.isUpperCase(s.charAt(i))){
                    this.result.add(Character.toLowerCase(s.charAt(i)));
                }
                else{
                    this.result.add(s.charAt(i));
                }
            }
            else{
                continue;
            }
        }
        for(int i=0; i<this.result.size()/2; i++){
            if(this.result.get(i) != this.result.get(this.result.size()-1-i)){
                return false;
            }
        }
        return true;
    }
}