class Solution {
    public int[] productExceptSelf(int[] nums) {
        int l = nums.length;
        int[] result = new int[l];
        int[] prefix = new int[l];
        int[] suffix = new int[l];
        int ap = 1;

        for(int i = 0; i < l; i++) {
            prefix[i] = ap * nums[i];
            ap = prefix[i];
        }

        ap = 1;
        for(int i = l-1; i >= 0; i--) {
            suffix[i] = ap * nums[i];
            ap = suffix[i];
        }

        for(int i = 0; i < l; i++) {
            if(i == 0) {
                result[i] = suffix[i+1];
            } else if(i == l-1) {
                result[i] = prefix[i-1];
            } else {
                result[i] = prefix[i-1] * suffix[i+1];
            }
        }

        return result;
    }
}  
