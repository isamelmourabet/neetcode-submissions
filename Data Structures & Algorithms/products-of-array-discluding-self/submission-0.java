class Solution {
    public int[] productExceptSelf(int[] nums) {
        /*
            [1,2,4,6]
            []
        */
        int l = nums.length;

        int[] result = new int[l];

        for(int i = 0; i < nums.length; i++) {
            int partialResult = 1;
            for(int j = 0; j < nums.length; j++) {
                if(j != i) {
                    partialResult *= nums[j];
                }
            }
            result[i] = partialResult;
        }

        return result;
    }
}  
