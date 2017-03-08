/*Given two strings s and t, write a function to determine if t is an anagram of s.

For example,
s = "anagram", t = "nagaram", return true.
s = "rat", t = "car", return false.

Note:
You may assume the string contains only lowercase alphabets.*/

public class Solution {
    public boolean isAnagram(String s, String t) {
    int sums = 0,sumt=0;
    HashMap<Character, Integer> mp = new HashMap();
    
    int sl = s.length();
    int tl = t.length();
    int i=0;
    if(sl != tl)
    {
        return false;
    }
    
    mp.put('a',2);mp.put('b',3);mp.put('c',5);mp.put('d',7);mp.put('e',11);mp.put('f',13);mp.put('g',17);mp.put('h',19);mp.put('i',23);mp.put('j',29);mp.put('k',31);mp.put('l',37);mp.put('m',41);mp.put('n',43);mp.put('o',47);mp.put('p',53);mp.put('q',59);mp.put('r',61);mp.put('s',67);mp.put('t',71);mp.put('u',73);mp.put('v',79);mp.put('w',83);mp.put('x',89);mp.put('y',91);mp.put('z',97);
    
    
    char sc[] = s.toCharArray();
    char tc[] = t.toCharArray();
    
    
    while(i<sl)
    {
        sums += mp.get(sc[i]);
        sumt += mp.get(tc[i]);
        i++;
    }
    if(sums == sumt)
    {
        return true;
    }
    else
    {
        return false;
    }
}
}
