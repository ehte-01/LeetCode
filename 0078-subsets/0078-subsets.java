class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result= new ArrayList<>();
        List<Integer> ds= new ArrayList<>();
        solve(0,nums,ds,result);
        return result;
    }

    private void solve(int index,int[] nums,List<Integer> ds,List<List<Integer>> result){
        if(index==nums.length){
            result.add(new ArrayList<>(ds));
            return;
        }
        
        ds.add(nums[index]);
        solve(index+1,nums,ds,result);
        ds.remove(ds.size()-1);
        solve(index+1,nums,ds,result);
        
    }
}