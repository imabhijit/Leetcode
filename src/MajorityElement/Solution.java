package MajorityElement;

import java.util.HashMap;

public class Solution {
    public int majorityElement(int[] nums) {
        int majority = (int) Math.floor(nums.length/2);
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i: nums){
            int count = map.getOrDefault(i, 0)+1;
            if(count > majority){
                return i;
            }
            map.put(i, count);
        }
        return -1;
    }
}
