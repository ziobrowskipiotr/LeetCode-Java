class Solution {
    int i = 0;
    int j = 0;
    public int removeElement(int[] nums, int val) {
        System.gc();
        while(this.j<nums.length){
            if(nums[this.j] == val){
                while(this.j<nums.length-1 && nums[this.j] == val){
                    this.j++;
                }
                if(nums[this.j] == val){
                    break;
                }
                nums[this.i] = nums[this.j];
                this.i++;
                this.j++;
            }
            else{
                nums[this.i] = nums[this.j];
                this.i++;
                this.j++;
            }
        }
        return this.i;
    }
}