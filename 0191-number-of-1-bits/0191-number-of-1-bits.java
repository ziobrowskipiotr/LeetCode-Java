class Solution {
    public int hammingWeight(int n) {
        int mask = 1<<30;
        int result = 0;
        while(mask > 0){
            if((mask & n)>0){
                result++;
            }
            mask >>=1;
        }
        return result;
    }
}