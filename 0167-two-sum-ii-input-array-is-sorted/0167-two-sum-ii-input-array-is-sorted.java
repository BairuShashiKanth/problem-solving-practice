class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;

        int left = 0, right = n-1,sum;
        while(left < right) {
            sum = numbers[left] + numbers[right];
            if(sum == target)
                break;
            else if( sum > target )
                right--;
            else
                left++;
        }

        return new int[] {left+1,right+1};
    }
}