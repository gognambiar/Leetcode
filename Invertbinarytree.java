//Invert a Binary Tree which is defined as a class below


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode invertTree(TreeNode root) {
      if(root == null) return root;
      TreeNode temp = new TreeNode(0);
      temp = root.left;
      root.left = root.right;
      root.right = temp;
      invertTree(root.left);
      invertTree(root.right);
      return root;
    }
}
