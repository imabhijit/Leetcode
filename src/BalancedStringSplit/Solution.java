package BalancedStringSplit;

public class Solution {
    public int balancedStringSplit(String s) {
        char[] chars = s.toCharArray();
        int countR=0;
        int countL=0;
        int ans=0;
        for(char c: chars){
            if(c == 'R') countR++;
            if(c == 'L') countL++;
            if(countR == countL) ans++;
        }
        return ans;
    }
}
