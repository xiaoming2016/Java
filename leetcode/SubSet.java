class SubSet{
public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        backtrack(0, nums, res, list);
        return res;

    }

    private void backtrack(int i, int[] nums, List<List<Integer>> res, ArrayList<Integer> list) {
        res.add(new ArrayList<>(list));
        for (int j = i; j < nums.length; j++) {
            list.add(nums[j]);
            backtrack(j + 1, nums, res, list);
            list.remove(list.size() - 1);
        }
    }

}
