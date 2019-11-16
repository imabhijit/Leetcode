package MoveZeroes;

public class Solution {
    public void moveZeroes(int[] nums) {
        int l=0, r=0, n = nums.length;
        while(r<n-1){
            r++;
            if(nums[r]!=0 && nums[l]==0){
                int temp = nums[r];
                nums[r] = nums[l];
                nums[l] = temp;
            }
            if(nums[l]!=0){
                l++;
            }
        }

    }
}
