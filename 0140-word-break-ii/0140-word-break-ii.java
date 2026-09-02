class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
        return solve(s, wordDict, 0);
    }
    List<String> solve(String s, List<String> dict, int start) {
        List<String> ans = new ArrayList<>();
        if (start == s.length()) {
            ans.add("");
            return ans;
        }
        for (int i = start + 1; i <= s.length(); i++) {
            String word = s.substring(start, i);
            if (dict.contains(word)) {
                List<String> rest = solve(s, dict, i);
                for (String x : rest) {
                    if (x.equals(""))
                        ans.add(word);
                    else
                        ans.add(word + " " + x);
                }
            }
        }
        return ans;
    }
}