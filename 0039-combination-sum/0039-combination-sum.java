class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans= new ArrayList<>();
        findCombination(0,target,candidates,ans,new ArrayList<>());
        return ans;
    }
    private void findCombination(int index,int target,int[] candidates,List<List<Integer>> ans,List<Integer> ds){
        if(index == candidates.length){
            if(target==0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        if(candidates[index]<=target){
            ds.add(candidates[index]);
            findCombination(index,target-candidates[index],candidates,ans,ds);
            ds.remove(ds.size()-1);
        }
        findCombination(index+1,target,candidates,ans,ds);

    }
}