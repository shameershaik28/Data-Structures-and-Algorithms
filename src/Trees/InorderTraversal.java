package Trees;

import java.util.*;

public class InorderTraversal {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
            left = null;
            right = null;
        }
    }

    ArrayList<Integer> ans = new ArrayList<>();

    public ArrayList<Integer> inorderTraversal(TreeNode A) {
        if (A == null)
            return ans;

        inorderTraversal(A.left);
        ans.add(A.val);
        inorderTraversal(A.right);

        return ans;
    }

    public static void main(String[] args) {
        // Creating a sample binary tree
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        InorderTraversal sol = new InorderTraversal();
        ArrayList<Integer> result = sol.inorderTraversal(root);

        // Printing the inorder traversal result
        System.out.println("Inorder Traversal: " + result);
    }
}
