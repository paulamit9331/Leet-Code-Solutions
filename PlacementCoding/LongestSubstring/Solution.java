package LongestSubstring;
import java.util.*;

public class Solution {
    private int lengthOfLongestSubstring(String str) {
        Set<Character> set = new HashSet<>();
        int i = 0, j = 0;
        int max = 0;
        
        while(j < str.length()) {
            if(!set.contains(str.charAt(j))) {
                set.add(str.charAt(j));
                j++;
                max = Math.max(set.size(), max);
            } else {
                set.remove(str.charAt(i));
                i++;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        String str = "aabcabcbb";

        lengthOfLongestSubstring(str);
    }
}