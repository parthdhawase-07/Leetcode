class Solution {
    public boolean isAnagram(String s, String t) 
    {
        
        s = s.toLowerCase();
        t = t.toLowerCase();

        char ch1[]= s.toCharArray();
        char ch2[]= t.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        boolean b= Arrays.equals(ch1,ch2);

        if(b)
        {
            return true;
        }
        return false;
    }
}