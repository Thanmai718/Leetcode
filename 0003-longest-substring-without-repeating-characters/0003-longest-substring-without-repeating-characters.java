class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0, r = 0;
        Set<Character> seen = new HashSet();
        int max = 0;
        while(r<s.length())
        {
            char c = s.charAt(r);
            if(seen.add(c))
            {
                max =Math.max(max,r-l+1);
                r++;
            }
            else
            {
                while(s.charAt(l)!=c)
                {
                    seen.remove(s.charAt(l));
                    l++;
                }
                seen.remove(c);l++;
            }
        }
        return max;
    }
}