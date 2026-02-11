class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int remaining;
        for(int i = 0;i<numbers.length;i++){
            remaining = numbers[i];
            for(int j = i+1; j <numbers.length;j++)
            {
                if(remaining + numbers[j] == target) return new int[]{i+1,j+1};
            }
        }

        return new int[] {0,0};
    }
}