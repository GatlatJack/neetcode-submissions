class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] result = new int[nums.length*2];
        int n = nums.length;
    
//add the same number twice, first at result[i], result[i+n], result[0],result[4] n = 4
        for(int i = 0; i < n; i++){
            result[i]=nums[i];
            result[i+n] = nums[i];
        }

        return result;
    
        
    }
}