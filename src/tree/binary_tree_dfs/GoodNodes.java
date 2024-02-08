package tree.binary_tree_dfs;

public class GoodNodes {
        public int goodNodes(TreeNode root) {
            return preorder(root,root.val);
        }
        private int preorder(TreeNode n, int v) {
            if (n == null) // base cases.
                return 0;
            int max = Math.max(n.val, v);
            return (n.val >= v ? 1 : 0) + preorder(n.left, max) + preorder(n.right, max);
        }
    }

//Leetcode : 1448