class Solution {
    public void moveZeroes(int[] nums) {
        int j = -1;
        int n = nums.length;
        for(int i = 0; i<n; i++){
            if(nums[i]==0){
                j = i;
                break;
            }
        }
        if (j == -1) return;
        if(n > 1){
            for( int i = j+1; i<n; i++){
                if(nums[i] != 0 ){
                    nums[j] = nums[i];
                    nums[i] = 0;
                    j++;
                }
            }
        }else{
            return;
        }
        return;
    }
}