class Solution {
    public boolean uniformArray(int[] nums1) {
        int min=nums1[0];
        int minOdd = Integer.MAX_VALUE;
        for (int x : nums1) {
            min = Math.min(min, x);

            if (x % 2 != 0)
                minOdd = Math.min(minOdd, x);
        }
        if (minOdd == Integer.MAX_VALUE)
            return true;
        return min % 2 != 0;
    }
}