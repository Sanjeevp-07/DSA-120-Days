class Solution {
    public int majorityElement(int[] nums) {
        HashMap <Integer, Integer> Majority = new HashMap<>();
        for (int num : nums) {
            Majority.put(num, Majority.getOrDefault(num, 0) + 1);
            if (Majority.get(num) > nums.length/2){
                return num;
            }
        }
        return -1;
    }
}