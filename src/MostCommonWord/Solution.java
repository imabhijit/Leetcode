package MostCommonWord;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        HashSet<String> banSet = new HashSet<String>(Arrays.asList(banned));
        String noPunctuations = paragraph.toLowerCase().replaceAll("[^a-z]"," ");
        String[] arr = noPunctuations.split(" ");

        for(String word: arr){
            if(!word.isEmpty() && !banSet.contains(word)){
                map.put(word, map.getOrDefault(word,0)+1);
            }
        }

        String output = "";
        for(String key: map.keySet()){
            if(output == "" || map.get(key) > map.get(output)){
                output = key;
            }
        }
        return output;
    }
}
