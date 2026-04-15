class Solution {
    public int removeDuplicates(int[] nums) {
        int index=1;

        for(int u=0; u<nums.length-1; u++){
            if(nums[u]!=nums[u+1]){
                nums[index++]=nums[u+1];
            }
        }
        
        return index;
    }
}