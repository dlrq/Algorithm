/*
 * @lc app=leetcode id=108 lang=java
 *
 * [108] Convert Sorted Array to Binary Search Tree
 */

// @lc code=start
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
class ConvertSortedArrayToBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums == null){
            return null;
        }
        return helper(0, nums.length - 1, nums);
    }

    public TreeNode helper(int low, int high, int[] nums){
        if(low > high) {
            return null;
        }
        int mid = (low + high) / 2;
        return new TreeNode(nums[mid], helper(low, mid - 1, nums), helper(mid + 1, high, nums));
    }
}
// @lc code=end

