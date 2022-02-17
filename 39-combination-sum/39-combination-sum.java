class Solution {
   public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        bt(list, new Stack<Integer>(), candidates, target, 0);
        return list;
    }

    private void bt(List<List<Integer>> list, Stack<Integer> temp, int[] candidates, int remain, int start) {
        if (remain == 0) {
            list.add(new ArrayList<>(temp));
            return;
        }
        if (remain <= 0)
            return;
        for (int i = start; i < candidates.length; i++) {
            temp.push(candidates[i]);
            bt(list, temp, candidates, remain - candidates[i], i);
            temp.pop();
        }
    }
}