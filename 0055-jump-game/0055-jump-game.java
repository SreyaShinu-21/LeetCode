class Solution {
    public boolean canJump(int[] nums) {
        int step=nums[0];
        for(int i=1;i<nums.length;i++){
            step--;
            if(step<0)
                return false;
            if(i==nums.length-1){
                return true;
            }
            if(step<nums[i]){
                step=nums[i];
            }
        }
        return true;
    }
}