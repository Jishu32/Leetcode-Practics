class Solution {
    public void rotate(int[] nums, int k) {
        int steps = k;
        for ( int s=1; s<=steps;){
            int temp = nums[nums.length - 1];
            for(int i = nums.length-1; i>0; i--){
                nums[i] = nums[i-1];
            }
            nums[0]= temp;
            s++;
        }
       
    }
}