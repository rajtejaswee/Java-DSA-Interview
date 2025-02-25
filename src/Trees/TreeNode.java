package Trees;

public class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;
    public TreeNode(int key) {
        this.data = key;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.right.left = new TreeNode(9);
    }
}
