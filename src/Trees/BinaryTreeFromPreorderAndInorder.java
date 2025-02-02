package Trees;

public class BinaryTreeFromPreorderAndInorder {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
            left = null;
            right = null;
        }
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        return buildingTree(preorder, 0, n - 1, inorder, 0, n - 1);
    }

    public TreeNode buildingTree(int[] preorder, int s1, int e1, int[] inorder, int s2, int e2) {
        if (s1 > e1 || s2 > e2) {
            return null;
        }

        // Root is the first element of preorder
        TreeNode root = new TreeNode(preorder[s1]);

        // Find the root in an inorder array
        int ind = -1;
        for (int i = s2; i <= e2; i++) {
            if (inorder[i] == preorder[s1]) {
                ind = i;
                break;
            }
        }

        // Number of elements in the left subtree
        int c = ind - s2;

        // Construct the left subtree using preorder and inorder
        root.left = buildingTree(preorder, s1 + 1, s1 + c, inorder, s2, ind - 1);

        // Construct the right subtree using preorder and inorder
        root.right = buildingTree(preorder, s1 + c + 1, e1, inorder, ind + 1, e2);

        return root;
    }

    public static void main(String[] args) {
        BinaryTreeFromPreorderAndInorder solution = new BinaryTreeFromPreorderAndInorder();

        // Example input arrays (Preorder and Inorder)
        int[] preorder = {3, 9, 20, 15, 7};
        int[] inorder = {9, 3, 15, 20, 7};

        // Build the binary tree
        TreeNode root = solution.buildTree(preorder, inorder);

        // Output the result (You can implement a method to print or verify the tree)
        System.out.println("Tree built successfully.");
    }
}
