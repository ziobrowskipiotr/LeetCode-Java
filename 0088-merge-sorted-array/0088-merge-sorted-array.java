class Solution {
    int point1;
    int point2;
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m+n-1;
        if(n==0){
        }
        else if(m==0){
            System.arraycopy(nums2, 0, nums1, 0, n);
        }
        else{
            while(m>=1 && n>=1){
                this.point1 = nums1[m-1];
                this.point2 = nums2[n-1];
                if(this.point1>this.point2){
                    nums1[i] = this.point1;
                    i--;
                    m--;
                }
                else if(this.point1<this.point2){
                    nums1[i] = this.point2;
                    i--;
                    n--;
                }
                else{
                    nums1[i] = this.point1;
                    i--;
                    nums1[i] = this.point2;
                    i--;
                    n--;
                    m--;
                }
            }
            if(m == 0){
                while(n>=1){
                    this.point2 = nums2[n-1];
                    nums1[i] = this.point2;
                    i--;
                    n--;
                }
            }
        }
    }
}
//