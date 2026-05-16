class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> resSet = new HashSet<>();
        for (int n : nums1) {
            set.add(n);
        }
        for (int val : nums2) {
            if (set.contains(val)) {
                resSet.add(val);
            }
        }
        int res[] = new int[resSet.size()];
        int idx = 0;
        for (int n : resSet) {
            res[idx++]=n;
        }
        return res;
    }
}