class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> ds= new ArrayList<>();
        findCombination(0,target,candidates,ds,ans);
        return ans;
    }
    private void findCombination(int index,int target,int[] candidates, List<Integer> ds,List<List<Integer>> ans){
       
        if(target==0){
            ans.add(new ArrayList<>(ds));
            return;
        }
        
        for(int i=index;i<candidates.length;i++){

            if(i>index && candidates[i]==candidates[i-1])
            continue;

            if(candidates[i]>target)
            break;
            
            ds.add(candidates[i]);
            findCombination(i+1,target-candidates[i],candidates,ds,ans);
            ds.remove(ds.size()-1);
        }
        

    }
}