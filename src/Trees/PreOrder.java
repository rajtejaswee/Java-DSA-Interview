package Trees;

import java.util.*;

public class PreOrder {
    //PreOrder : Root + Left + Right
    //Recursion Approach
    public static void PreOrderRecursion(TreeNode root) {
        if(root == null) return;
        System.out.println(root);
        PreOrderRecursion(root.left);
        PreOrderRecursion(root.right);
    }
    //Iterative Approach
    public static void PreOrderIterative(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        TreeNode curr = root;
        st.add(curr);
        while(!st.isEmpty()) {
            curr = st.pop();
            list.add(curr.data);
            if(curr.right != null) {
                st.push(curr.right);
            }
            if(curr.left != null) {
                st.push(curr.left);
            }
        }
    }
}
