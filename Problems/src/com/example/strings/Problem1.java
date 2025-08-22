package com.example.strings;

import java.util.HashMap;
import java.util.Map;

public class Problem1 {
	 public int firstUniqChar(String s) {
		 if(s.length()==0) return -1;
		 Map<Character, Integer> freqMap = new HashMap<>();
	        
	        // Count frequencies
	        for (char c : s.toCharArray()) {
	            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
	        }
	        
	        // Find first unique char
	        for (int i = 0; i < s.length(); i++) {
	            if (freqMap.get(s.charAt(i)) == 1) {
	                return i;  // return index
	            }
	        }
	        
	        return -1;
	    }
}
