class Solution {
    public int hammingWeight(int n) {
        int mask1 = 1<<30;
        int mask2 = 1<<23;
        int mask3 = 1<<15;
        int mask4 = 1<<7;
        int result = 0;
        while(mask4 > 0){
            if((mask2 & n)>0){
                result++;
            }
            if((mask3 & n)>0){
                result++;
            }
            if((mask4 & n)>0){
                result++;
            }
            if(mask1 < (1<<24)){
                break;
            }
            if((mask1 & n)>0){
                result++;
            }
            mask1 >>=1;
            mask2 >>=1;
            mask3 >>=1;
            mask4 >>=1;
        }
        return result;
    }
}