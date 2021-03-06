// Given the root of a binary tree and an integer targetSum, return true if the tree has a root-to-leaf path such that adding up all the values along the path equals targetSum.

// A leaf is a node with no children.

 

// Example 1:


// Input: root = [5,4,8,11,null,13,4,7,2,null,null,null,1], targetSum = 22
// Output: true
// Example 2:


// Input: root = [1,2,3], targetSum = 5
// Output: false
// Example 3:

// Input: root = [1,2], targetSum = 0
// Output: false

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        
        if(root==null) return false;
        return checksum(root,0,targetSum);
    }
    public boolean checksum(TreeNode node,int curSum,int targetSum)
    {
        curSum+=node.val;
        if(node.left==null && node.right==null) return curSum==targetSum;
        if(node.left!=null && checksum(node.left,curSum,targetSum))
        {
            
                return true;
        }
        if(node.right!=null && checksum(node.right,curSum,targetSum))
        {
           
                return true;
        }
        return false;
    }
}
