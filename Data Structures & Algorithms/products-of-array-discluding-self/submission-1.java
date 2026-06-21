class Solution {
    public int[] productExceptSelf(int[] nums) {
        int l = nums.length;
        int[] result = new int[l];

        for(int i = 0; i < l; i++) {
            int partialResult = 1;
            for(int j = 0; j < l; j++) {
                if(j != i) {
                    partialResult *= nums[j];
                }
            }
            result[i] = partialResult;
        }

        return result;
    }
}  
