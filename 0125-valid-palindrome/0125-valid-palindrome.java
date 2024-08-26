class Solution {
    ArrayList<Character> result = new ArrayList<>();
    public boolean isPalindrome(String s) {
        for(int i=0; i<s.length(); i++){
            if(96<(int)s.charAt(i) && (int)s.charAt(i)<123){
                this.result.add(s.charAt(i));
            }
            else if(64<(int)s.charAt(i) && (int)s.charAt(i)<91){
                this.result.add((char)((int)s.charAt(i)+32));
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