class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> Duplicate = new HashMap<>();

        for(int val : nums){
            Duplicate.put(val, Duplicate.getOrDefault(val,0) + 1);
            int check = Duplicate.get(val);
            if(check == 2){
                return true;
            }
        }
        return false;
    }
}