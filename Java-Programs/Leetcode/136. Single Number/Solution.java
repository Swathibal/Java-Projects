// Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

// You must implement a solution with a linear runtime complexity and use only constant extra space.

 

// Example 1:

// Input: nums = [2,2,1]
// Output: 1
// Example 2:

// Input: nums = [4,1,2,1,2]
// Output: 4
// Example 3:

// Input: nums = [1]
// Output: 1

//using bit manipulation

class Solution {
    public int singleNumber(int[] nums) {
        int xor = 0;
        for(int i:nums)
        {
            xor^=i;
        }
        return xor;
    }
}


//using arraylist

class Solution {
    public int singleNumber(int[] nums) {
       List<Integer> l = new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(!l.contains(nums[i])){
                l.add(nums[i]);
            }
            else{
                l.remove(new Integer(nums[i]));
            }
        }
        return l.get(0);
    }
}
