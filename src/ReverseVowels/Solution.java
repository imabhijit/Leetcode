package ReverseVowels;

import java.util.HashSet;

public class Solution {
    public String reverseVowels(String s) {
        HashSet<Character> vowels = new HashSet<Character>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');

        int leftIndex = 0;
        int rightIndex = s.length()-1;

        char[] chars = s.toCharArray();

        while(leftIndex < rightIndex){
            while(leftIndex < rightIndex && !vowels.contains(chars[leftIndex])){
                leftIndex++;
            }
            while(leftIndex < rightIndex && !vowels.contains(chars[rightIndex])){
                rightIndex--;
            }

            if(vowels.contains(chars[leftIndex])
                    && vowels.contains(chars[rightIndex])){
                //swap
                char temp = chars[leftIndex];
                chars[leftIndex] = chars[rightIndex];
                chars[rightIndex] = temp;

                //move to next
                leftIndex++;
                rightIndex--;
            }
        }
        return String.valueOf(chars);
    }
}
