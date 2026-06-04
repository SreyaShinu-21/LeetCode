class Solution {
    public int longestSubarray(int[] nums) {
        int max=0;
        int dl=0;
        int ws=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                dl++;
            }
            while(dl>1){
                if(nums[ws]==0){
                    dl--;
                }ws++;
            }
            max=Math.max(max,i-ws);
        }
        return max;
    }
}