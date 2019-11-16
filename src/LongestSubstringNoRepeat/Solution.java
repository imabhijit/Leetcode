package LongestSubstringNoRepeat;

import java.util.HashSet;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        int n = s.length();
        int l = 0, r = 0;
        char c;
        HashSet<Character> set = new HashSet<>();
        while(l<n && r<n){
            c = s.charAt(r);
            if(!set.contains(c)){
                set.add(c);
                r++;
            } else {
                set.remove(s.charAt(l));
                l++;
            }
            max = Math.max(max, r-l);
        }
        return max;
    }
}
