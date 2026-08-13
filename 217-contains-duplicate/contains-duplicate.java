class Solution {
    public boolean containsDuplicate(int[] nums) 
    {
        HashSet <Integer> set = new HashSet<>();

        for(Integer item:nums)
        {
            if(set.contains(item))
            {
                return true;
            }
            set.add(item);
        }
        return false;
    }
}