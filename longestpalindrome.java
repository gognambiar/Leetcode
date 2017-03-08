/*Given a string which consists of lowercase or uppercase letters, find the length of the longest palindromes that can be built with those letters.

This is case sensitive, for example "Aa" is not considered a palindrome here.

Note:
Assume the length of given string will not exceed 1,010.*/

public class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
        int ctr = 0;
        int k = s.length();
        char[] strArray = s.toCharArray();

        if(k == 1)
        {
            return(1);
        }
 
        for (char c : strArray)
        {
            if(charCountMap.get(c) == null)
            {
                charCountMap.put(c, 1);
            }
            else
            {
                ctr += 1;
                charCountMap.put(c, null);
            }
        }
        if(k - ctr <= k/2)
        {
            return(2*ctr);    
        }

        else
        {
            return(2*ctr+1);
        }
    }
}
