class Solution {
    public boolean check(int[] nums) {

        // My solution -> 
        // int j=0;
        // for(int i=1; i<nums.length; i++){
        //     if(nums[i]>=nums[i-1]){

        //     }else{
        //         j++;
        //         if(j==2){
        //             return false;
        //         }
        //         if(nums[nums.length - 1] > nums[0]){
        //             return false;
        //         }
        //     }
        // }
        // return true;
        
        // Optimal by Love bubber ->
        int n = nums.length;
        int count = 0;
        for(int i=1; i<n; i++){
            if(nums[i-1] > nums[i]){
                count++;
            }
        }
        if(nums[n-1] > nums[0]){
            count++;

        }
        return count<=1;
    }
}