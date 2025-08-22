
package com.example.arrays;

import java.util.HashMap;
import java.util.Map;

//longest palindrome in a string
public class Problem14 {

	 public int lengthOfLongestSubstring(String s) {
		 int n = s.length();
		    int result = 0;
		    int left = 0;
		    Map<Character, Integer> map = new HashMap();
		    for (int right = 0; right < n; right++) {
		        char c = s.charAt(right);
		        if (map.containsKey(c) && map.get(c) >= left) {
		            left = map.get(c) + 1; // Move left pointer past duplicate
		        }
		        map.put(c, right);
		        result = Math.max(result, right - left + 1);
		    }
		    return result;
	    }
	
	 //Kadane's Algorithm
	 public int longestPalindromeLength(String s) {
		    if (s == null || s.length() < 1) return 0;
		    int maxLen = 1;

		    for (int i = 0; i < s.length(); i++) {
		        int len1 = expandFromCenter(s, i, i);     // odd length
		        int len2 = expandFromCenter(s, i, i + 1); // even length
		        maxLen = Math.max(maxLen, Math.max(len1, len2));
		    }
		    return maxLen;
		}

		private int expandFromCenter(String s, int left, int right) {
		    while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
		        left--;
		        right++;
		    }
		    return right - left - 1; // length of palindrome
		}

}
