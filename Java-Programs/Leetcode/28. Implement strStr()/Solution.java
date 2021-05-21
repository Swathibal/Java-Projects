// Implement [strStr()](http://www.cplusplus.com/reference/cstring/strstr/).

// Return the index of the first occurrence of needle in haystack, or `-1` if `needle` is not part of `haystack`.

// **Clarification:**

// What should we return when `needle` is an empty string? This is a great question to ask during an interview.

// For the purpose of this problem, we will return 0 when `needle` is an empty string. This is consistent to C's [strstr()](http://www.cplusplus.com/reference/cstring/strstr/) and Java's [indexOf()](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#indexOf(java.lang.String)).

// **Example 1:**

// ```
// Input: haystack = "hello", needle = "ll"
// Output: 2

// ```

// **Example 2:**

// ```
// Input: haystack = "aaaaa", needle = "bba"
// Output: -1

// ```

// **Example 3:**

// ```
// Input: haystack = "", needle = ""
// Output: 0
// ```


class Solution {
    public int strStr(String haystack, String needle) {
        int ind=0;
        if(needle == null)
            return 0;
        ind = haystack.indexOf(needle);
        return ind>=0 ? ind : -1; 
            
    }
}
