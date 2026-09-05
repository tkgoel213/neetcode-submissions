class Solution {
    public int search(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        //maanlo ek hi element hai isilie = lagae hai , last me kuch cases me dono 
        //low high ek hi element ko point karte hai.. 
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if( nums[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }

        return -1;
        
    }
}
