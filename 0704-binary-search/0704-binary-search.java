class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;

        int low = 0;
        int high = n-1;

        // Normal Iterative Approch
        // while(low < high){
        //     int mid = (low+high)/2;

        //     if(nums[mid] == target){
        //         return mid;
        //     }else if(target > nums[mid]){
        //         low = mid+1;
        //     }else{
        //         high = mid-1;
        //     }
        // }return -1;

        // recursavice approch
        //cannot write data types while passing arguments
        return binerySearch(nums, low, high, target); 
    }

    // recursavice approch
    public int binerySearch(int[] nums, int low, int high, int target){
        if(low>high) return -1;

        int mid = (low+high)/2;
        if(nums[mid] == target){
            return mid;
        }else if(target > nums[mid]){
            //cannot write data types while passing arguments
            return binerySearch(nums,mid+1,high,target);
        }else{
            //cannot write data types while passing arguments
            return binerySearch(nums,low,high-1,target);
        }
    }
    // recursavice approch
    
}