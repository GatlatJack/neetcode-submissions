class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] result = new int[nums.length*2];
        int n = nums.length;
        int count = 0;

        for(int i = 0; i < n; i++){
            result[i]=nums[i];
        }

          for(int k = n;  k < 2*n; k++){
            result[k] = nums[count];
            count++;
        }

        return result;
        
        
        
    }
}