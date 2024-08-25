class Solution {
    int i = 0;
    int j = 0;
    int val;
    int[] nums;
    public int removeElement(int[] nums, int val) {
        this.val = val;
        this.nums = nums;
        while(this.j<this.nums.length){
            if(this.nums[this.j] == this.val){
                while(this.j<this.nums.length-1 && this.nums[this.j] == this.val){
                    this.j++;
                }
                if(this.nums[this.j] == this.val){
                    break;
                }
                this.nums[this.i] = this.nums[this.j];
                this.i++;
                this.j++;
            }
            else{
                this.nums[this.i] = this.nums[this.j];
                this.i++;
                this.j++;
            }
        }
        System.gc();
        return this.i;
    }
}