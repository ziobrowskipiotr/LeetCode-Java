//5
class Solution {
    public int removeElement(int[] nums, int val){
        short j = 0;
        int l = nums.length;
        for(int i=0; i<l; i++){
            if(nums[i] != val){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}