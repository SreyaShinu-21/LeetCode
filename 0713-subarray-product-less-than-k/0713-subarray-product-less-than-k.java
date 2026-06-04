class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1)
            return 0;
        int wp=0;
        int product=1;
        int max=0;
        for(int i=0;i<nums.length;i++){
            product=product*nums[i];
            while(product>=k){
                product=product/nums[wp];
                wp++;
            }
            max=max+i-wp+1;
        }
        return max;
    }
}