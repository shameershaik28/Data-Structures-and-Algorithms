package Trees;

import java.util.*;

public class PostorderTraversal {
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

    public ArrayList<Integer> postorderTraversal(TreeNode A) {
        if (A == null)
            return ans;

        postorderTraversal(A.left);
        postorderTraversal(A.right);
        ans.add(A.val);

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

        PostorderTraversal sol = new PostorderTraversal();
        ArrayList<Integer> result = sol.postorderTraversal(root);

        // Printing the postorder traversal result
        System.out.println("Postorder Traversal: " + result);
    }
}

