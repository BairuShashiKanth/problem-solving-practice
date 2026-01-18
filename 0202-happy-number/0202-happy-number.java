class Solution {

    public boolean isHappy(int n) {

        HashSet<Integer> set = new HashSet<>();

        while(n != 1)
        {
            n = sumOfSquares(n);
            if(set.contains(n)) return false;
            set.add(n);
            
        }
        
        return true;

    }

    public int sumOfSquares(int n){
        int sum = 0, digit;
        while(n>0){
            digit = n%10;
            sum+= digit*digit;
            n/= 10;
        }
        return sum;
    }
}