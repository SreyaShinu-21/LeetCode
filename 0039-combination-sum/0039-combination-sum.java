class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        solve(candidates,target,0,new ArrayList<>(),ans);
        return ans;
    }
    void solve(int[] a,int target,int i,List<Integer> temp,List<List<Integer>> ans){
        if(target == 0){
            ans.add(new ArrayList<>(temp));
            return;
        }
        if(i==a.length||target<0)
           return;
        temp.add(a[i]);
        solve(a,target-a[i],i,temp,ans);
        temp.remove(temp.size()-1);
        solve(a,target,i+1,temp,ans);
    }
}