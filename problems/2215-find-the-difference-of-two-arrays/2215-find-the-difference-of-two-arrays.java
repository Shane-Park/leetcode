class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        answer.add(list1);
        answer.add(list2);

        list1.addAll(Arrays.stream(nums1).filter(i -> Arrays.binarySearch(nums2, i) < 0).distinct().boxed().collect(Collectors.toList()));
        list2.addAll(Arrays.stream(nums2).filter(i -> Arrays.binarySearch(nums1, i) < 0).distinct().boxed().collect(Collectors.toList()));

        return answer;
    }
}