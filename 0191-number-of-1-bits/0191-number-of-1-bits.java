class Solution {
    public int hammingWeight(int n) {
        int[] tab = new int[]{1<<30, 0};
        while(tab[0] > 0){
            if((tab[0] & n)>0){
                tab[1]++;
            }
            tab[0] >>=1;
        }
        return tab[1];
    }
}