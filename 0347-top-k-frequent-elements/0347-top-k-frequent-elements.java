class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n : nums)
            map.put(n, map.getOrDefault(n, 0) + 1);
        int[] ans = new int[k];
        for(int i = 0; i < k; i++) {
            int max = 0, num = 0;
            for(int key : map.keySet()) {
                if(map.get(key) > max) {
                    max = map.get(key);
                    num = key;
                }
            }
            ans[i] = num;
            map.remove(num);
        }
        return ans;
    }
}