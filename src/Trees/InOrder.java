package Trees;
import java.util.*;

public class InOrder {
    //InOrder: Left + Root + Right
    //Recursion Code
    public static void InOrderRecursion(TreeNode root) {
        if(root == null) return;
        InOrderRecursion(root.left);
        System.out.println(root.data);
        InOrderRecursion(root.right);
    }
    //Iterative Code
    public static void InOrderIteravtive(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        TreeNode curr = root;
        if(root == null) return;
        while(true) {
            if (curr != null) {
                st.push(curr);
                curr = curr.left;
            } else {
                if (st.isEmpty()) {
                    break;
                }
                curr = st.pop();
                list.add(curr.data);
                curr = curr.right;
            }
        }
    }
}
