class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer,Integer> hashMap = new HashMap();

        int remaining;

        for(int i = 0; i < nums.length ; i++){
            remaining = target - nums[i];

            if(hashMap.containsKey(remaining) )
                return new int[] {i,hashMap.get(remaining)};
            
            hashMap.put(nums[i],i); 
        }

        return new int[] {};
    }
}