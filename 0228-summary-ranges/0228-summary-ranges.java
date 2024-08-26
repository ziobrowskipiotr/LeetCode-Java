class Solution {
    List<String> lista = new ArrayList<>();
    public List<String> summaryRanges(int[] nums) {
        int i = 0;
        int j = 1;
        while(i<nums.length){
            if(j<nums.length && nums[j-1]+1 == nums[j]){
                j++;
            }
            else{
                if(nums[i] != nums[j-1]){
                    this.lista.add(nums[i]+"->"+nums[j-1]);
                    i = j;
                    j++;
                }
                else{
                    this.lista.add(Integer.toString(nums[i]));
                    if(i<nums.length){
                        i++;
                        j++;
                    }
                    else{
                        break;
                    }
                }
            }
        }
        return this.lista;
    }
}