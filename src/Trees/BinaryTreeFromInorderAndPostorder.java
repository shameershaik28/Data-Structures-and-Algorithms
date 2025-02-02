package Trees;

public class BinaryTreeFromInorderAndPostorder {
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
    public TreeNode buildTree(int[] A, int[] B) {
        int n = A.length;
        int m = B.length;
        return buildingTheTree(A, 0, n - 1, B, 0, m - 1);
    }

    public TreeNode buildingTheTree(int[] in, int s1, int e1, int[] pos, int s2, int e2) {
        if (s1 > e1) {
            return null;
        }
        // Search for root in pos[s2.......e2]
        TreeNode root = new TreeNode(pos[e2]);
        int ind = -1;
        for (int i = s1; i <= e1; i++) {
            if (in[i] == pos[e2]) {
                ind = i;
                break;
            }
        }
        // Number of elements in in[] LST.
        int c = ind - s1;
        // Construct LST and return root of LST.
        root.left = buildingTheTree(in, s1, ind - 1, pos, s2, s2 + c - 1);
        // Construct RST and return root of RST.
        root.right = buildingTheTree(in, ind + 1, e1, pos, s2 + c, e2 - 1);
        return root;
    }

    public static void main(String[] args) {
        BinaryTreeFromInorderAndPostorder solution = new BinaryTreeFromInorderAndPostorder();

        // Example input arrays (Inorder and Postorder)
        int[] inorder = {9, 3, 15, 20, 7};
        int[] postorder = {9, 15, 7, 20, 3};

        // Build the binary tree
        TreeNode root = solution.buildTree(inorder, postorder);

        // Output the result (You can implement a method to print or verify the tree)
        System.out.println("Tree built successfully.");
    }
}

