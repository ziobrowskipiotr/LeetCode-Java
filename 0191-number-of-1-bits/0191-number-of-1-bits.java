class Solution {
    
    public int hammingWeight(int n) {
        int[] tab = new int[]{1<<30, 1<<15, 0};
        while(tab[1] > 0){
            if((tab[1] & n)>0){
                tab[2]++;
            }
            if(tab[0] < (1<<16)){
                break;
            }
            if((tab[0] & n)>0){
                tab[2]++;
            }
            tab[0] >>=1;
            tab[1] >>=1;
        }
        return tab[2];
    }
}