class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] result = new int[nums.length*2];
        int n = nums.length;
        
/*on my first try i just looped

for(int i = 0; i < n; i++){
            result[i]=nums[i];
            
        }

        for(int k  = n; k < n*2; k++){
            result[n-k]=nums[i];
            
        }


*/





        for(int i = 0; i < n; i++){
            result[i]=nums[i];
            result[i+n] = nums[i];
        }


        return result;
        
        
        
    }
}