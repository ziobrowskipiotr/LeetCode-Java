class Solution {
    HashMap<Integer, Integer> map = new HashMap<>();
    public int[] twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length; i++){
            if(this.map.containsValue(target - nums[i])){
                for(int j=map.size()-1; j>=0; j--){
                    if(this.map.get(j) == target - nums[i]){
                        return new int[]{j, map.size()};
                    }
                }
            }
            else{
                this.map.put(i, nums[i]);
            }
        }
        return null;
    }
}