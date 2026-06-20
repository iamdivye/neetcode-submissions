class Solution {
    public int removeElement(int[] nums, int val) {
        int j=nums.length-1,k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != val) k++;
            if(nums[i] == val){
                if(i==j)
                break;
                while(j>=0 && nums[j] == val){
                    j--;
                }
                if(j<=i) break;
                else{
                    k++;
                    int t=nums[i];
                    nums[i]=nums[j];
                    nums[j]=t;
                }
            }
        }
        
        return k;
    }
}