class Solution {
    HashMap<Character, Integer> map = new HashMap<>();

    public boolean canConstruct(String ransomNote, String magazine) {
        char[] mag = magazine.toCharArray();
        char[] rans = ransomNote.toCharArray();
        for(int i=0; i<mag.length; i++){
            if(this.map.containsKey(mag[i])){
                this.map.put(mag[i], map.get(mag[i])+1);
            }
            else{
                this.map.put(mag[i], 1);
            }
        }
        for(int i=0; i<rans.length; i++){
            if(this.map.containsKey(rans[i])){
                if(this.map.get(rans[i])==0){
                    return false;
                }
                else{
                    this.map.put(rans[i], this.map.get(rans[i])-1);
                }
            }
            else{
                return false;
            }
        }
        return true;
    }
}