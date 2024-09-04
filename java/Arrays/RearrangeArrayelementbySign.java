class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] positive = new int[nums.length];
        int[] negative = new int[nums.length];
        int j = 0;
        int k =0;
        for(int i = 0; i<nums.length ; i++){
            if(nums[i] >0 ){
               positive[j] = nums[i];
               j++;
            }
            else{
                negative[k] = nums[i];
                k++;
            }
        }
        k =0;
        j=0;
        for(int i = 0 ; i<nums.length;i += 2){
            nums[i] = positive[k];
            k++;
        }
        for(int i = 1; i<nums.length ; i +=2){
            nums[i] = negative[j];
            j++;
        }
        return nums;
    }
}
