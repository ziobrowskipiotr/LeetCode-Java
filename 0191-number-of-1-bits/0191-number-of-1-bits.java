class Solution {
    public int hammingWeight(int n) {
        int[] tab = new int[]{1<<30, 1<<23, 1<<15, 1<<7, 0};
        while(tab[3] > 0){
            if((tab[1] & n)>0){
                tab[4]++;
            }
            if((tab[2] & n)>0){
                tab[4]++;
            }
            if((tab[3] & n)>0){
                tab[4]++;
            }
            if(tab[0] < (1<<24)){
                break;
            }
            if((tab[0] & n)>0){
                tab[4]++;
            }
            tab[0] >>=1;
            tab[1] >>=1;
            tab[2] >>=1;
            tab[3] >>=1;
        }
        return tab[4];
    }
}