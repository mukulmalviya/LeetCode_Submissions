class Solution {
    public int removeDuplicates(int[] nums) {
        int uniLen;
        int repeat = 1, element=0;
        while(repeat<nums.length){
            if(nums[repeat] == nums[element]){
                repeat++;
            }else{
                nums[element+1]=nums[repeat];
                element++;
                repeat++;
            }
        }
        
        uniLen = element+1;
        
        return uniLen;
    }
}
