class Solution {
    HashMap<Integer, Integer> map = new HashMap<>();
    public int[] twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length; i++){
            if(this.map.containsKey(target - nums[i])){
                return new int[]{this.map.get(target - nums[i]), i};
            }
            else{
                this.map.put(nums[i], i);
            }
        }
        return null;
    }
}