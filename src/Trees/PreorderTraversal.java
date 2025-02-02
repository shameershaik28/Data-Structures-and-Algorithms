package Trees;

import java.util.*;

public class PreorderTraversal {
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

    public ArrayList<Integer> preorderTraversal(TreeNode A) {
        if (A == null)
            return ans;

        ans.add(A.val);
        preorderTraversal(A.left);
        preorderTraversal(A.right);

        return ans;
    }

    public static void main(String[] args) {
        // Creating a sample binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        PreorderTraversal sol = new PreorderTraversal();
        ArrayList<Integer> result = sol.preorderTraversal(root);

        // Printing the preorder traversal result
        System.out.println("Preorder Traversal: " + result);
    }
}

