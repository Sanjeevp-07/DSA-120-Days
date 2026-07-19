/* class Solution {
    public int[] twoSum(int[] nums, int target) {
         
        for(int i = 0; i < nums.length; i++){
             for (int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
             }
        }
        return new int[]{};
    }
} */

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer, Integer> sum = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int temp = target - nums[i];

            if(sum.containsKey(temp)){                
                return new int[]{sum.get(temp), i};
            }
            sum.put(nums[i], i);
        }
        return new int[]{};
    }
}